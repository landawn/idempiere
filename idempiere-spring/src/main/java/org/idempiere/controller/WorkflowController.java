package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.WorkflowNode;
import org.idempiere.model.WorkflowNodeNext;
import org.idempiere.model.WorkflowProcess;
import org.idempiere.model.WorkflowActivity;
import org.idempiere.model.WorkflowResponsible;
import org.idempiere.service.WorkflowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Workflow operations.
 */
@RestController
@RequestMapping("/api/workflow")
public class WorkflowController {

    private final WorkflowService workflowService;

    public WorkflowController(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    // WorkflowNode endpoints
    @GetMapping("/nodes/{id}")
    public ResponseEntity<WorkflowNode> getNodeById(@PathVariable Integer id) {
        return workflowService.findNodeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nodes/workflow/{workflowId}")
    public ResponseEntity<List<WorkflowNode>> getNodesByWorkflow(@PathVariable Integer workflowId) {
        return ResponseEntity.ok(workflowService.findNodesByWorkflow(workflowId));
    }

    @GetMapping("/nodes/value")
    public ResponseEntity<WorkflowNode> getNodeByValue(@RequestParam String value, @RequestParam Integer workflowId) {
        return workflowService.findNodeByValue(value, workflowId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/nodes")
    public ResponseEntity<WorkflowNode> createNode(@RequestBody WorkflowNode node) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workflowService.saveNode(node));
    }

    @PutMapping("/nodes/{id}")
    public ResponseEntity<WorkflowNode> updateNode(@PathVariable Integer id, @RequestBody WorkflowNode node) {
        if (!workflowService.findNodeById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        node.setAdWfNodeId(id);
        return ResponseEntity.ok(workflowService.saveNode(node));
    }

    // WorkflowNodeNext endpoints
    @GetMapping("/nodes/{nodeId}/next")
    public ResponseEntity<List<WorkflowNodeNext>> getNodeNextsByNode(@PathVariable Integer nodeId) {
        return ResponseEntity.ok(workflowService.findNodeNextsByNode(nodeId));
    }

    @PostMapping("/nodes/next")
    public ResponseEntity<WorkflowNodeNext> createNodeNext(@RequestBody WorkflowNodeNext nodeNext) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workflowService.saveNodeNext(nodeNext));
    }

    @PutMapping("/nodes/next/{id}")
    public ResponseEntity<WorkflowNodeNext> updateNodeNext(@PathVariable Integer id, @RequestBody WorkflowNodeNext nodeNext) {
        nodeNext.setAdWfNodeNextId(id);
        return ResponseEntity.ok(workflowService.saveNodeNext(nodeNext));
    }

    // WorkflowProcess endpoints
    @GetMapping("/processes/{id}")
    public ResponseEntity<WorkflowProcess> getProcessById(@PathVariable Integer id) {
        return workflowService.findProcessById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/processes/workflow/{workflowId}")
    public ResponseEntity<List<WorkflowProcess>> getProcessesByWorkflow(@PathVariable Integer workflowId) {
        return ResponseEntity.ok(workflowService.findProcessesByWorkflow(workflowId));
    }

    @GetMapping("/processes/record")
    public ResponseEntity<List<WorkflowProcess>> getProcessesByRecord(@RequestParam Integer tableId, @RequestParam Integer recordId) {
        return ResponseEntity.ok(workflowService.findProcessesByRecord(tableId, recordId));
    }

    @GetMapping("/processes/state/{wfState}/client/{clientId}")
    public ResponseEntity<List<WorkflowProcess>> getProcessesByState(@PathVariable String wfState, @PathVariable Integer clientId) {
        return ResponseEntity.ok(workflowService.findProcessesByState(wfState, clientId));
    }

    @GetMapping("/processes/user/{userId}/active")
    public ResponseEntity<List<WorkflowProcess>> getActiveProcessesByUser(@PathVariable Integer userId) {
        return ResponseEntity.ok(workflowService.findActiveProcessesByUser(userId));
    }

    @PostMapping("/processes")
    public ResponseEntity<WorkflowProcess> createProcess(@RequestBody WorkflowProcess process) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workflowService.saveProcess(process));
    }

    @PutMapping("/processes/{id}")
    public ResponseEntity<WorkflowProcess> updateProcess(@PathVariable Integer id, @RequestBody WorkflowProcess process) {
        if (!workflowService.findProcessById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        process.setAdWfProcessId(id);
        return ResponseEntity.ok(workflowService.saveProcess(process));
    }

    // WorkflowActivity endpoints
    @GetMapping("/activities/{id}")
    public ResponseEntity<WorkflowActivity> getActivityById(@PathVariable Integer id) {
        return workflowService.findActivityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/activities/process/{processId}")
    public ResponseEntity<List<WorkflowActivity>> getActivitiesByProcess(@PathVariable Integer processId) {
        return ResponseEntity.ok(workflowService.findActivitiesByProcess(processId));
    }

    @GetMapping("/activities/user/{userId}/active")
    public ResponseEntity<List<WorkflowActivity>> getActiveActivitiesByUser(@PathVariable Integer userId) {
        return ResponseEntity.ok(workflowService.findActiveActivitiesByUser(userId));
    }

    @PostMapping("/activities")
    public ResponseEntity<WorkflowActivity> createActivity(@RequestBody WorkflowActivity activity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workflowService.saveActivity(activity));
    }

    @PutMapping("/activities/{id}")
    public ResponseEntity<WorkflowActivity> updateActivity(@PathVariable Integer id, @RequestBody WorkflowActivity activity) {
        if (!workflowService.findActivityById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        activity.setAdWfActivityId(id);
        return ResponseEntity.ok(workflowService.saveActivity(activity));
    }

    // WorkflowResponsible endpoints
    @GetMapping("/responsible/{id}")
    public ResponseEntity<WorkflowResponsible> getResponsibleById(@PathVariable Integer id) {
        return workflowService.findResponsibleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/responsible/client/{clientId}")
    public ResponseEntity<List<WorkflowResponsible>> getResponsiblesByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(workflowService.findResponsiblesByClient(clientId));
    }

    @GetMapping("/responsible/name")
    public ResponseEntity<WorkflowResponsible> getResponsibleByName(@RequestParam String name, @RequestParam Integer clientId) {
        return workflowService.findResponsibleByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/responsible")
    public ResponseEntity<WorkflowResponsible> createResponsible(@RequestBody WorkflowResponsible responsible) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workflowService.saveResponsible(responsible));
    }

    @PutMapping("/responsible/{id}")
    public ResponseEntity<WorkflowResponsible> updateResponsible(@PathVariable Integer id, @RequestBody WorkflowResponsible responsible) {
        if (!workflowService.findResponsibleById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        responsible.setAdWfResponsibleId(id);
        return ResponseEntity.ok(workflowService.saveResponsible(responsible));
    }
}
