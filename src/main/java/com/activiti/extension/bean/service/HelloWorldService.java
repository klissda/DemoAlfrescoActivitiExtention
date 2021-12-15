package com.activiti.extension.bean.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

    public String greeting() {
        return "Hello World from Service!";
    }

    public void customGreeting(DelegateExecution execution, String text) {
        logger.info("[Process=" + execution.getProcessInstanceId() +
                "][Java Delegate=" + this + "]");
        logger.info("Hello World: " + text);
    }

}