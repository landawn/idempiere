package org.idempiere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * iDempiere Spring Boot Application
 *
 * Main entry point for the iDempiere ERP system built with Spring Boot
 * and Abacus JDBC.
 */
@SpringBootApplication
public class IdempiereApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdempiereApplication.class, args);
    }
}
