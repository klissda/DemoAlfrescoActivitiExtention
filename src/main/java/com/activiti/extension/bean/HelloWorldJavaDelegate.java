package com.activiti.extension.bean;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class HelloWorldJavaDelegate implements JavaDelegate {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldJavaDelegate.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        logger.info("[Process=" + execution.getProcessInstanceId() +
                "][Java Delegate=" + this + "]");
        logger.info("[ActivityName=" + execution.getCurrentActivityName() +
                "][ActivityId=" + execution.getCurrentActivityId() + "]");


        String initiator = (String) execution.getVariable("initiator");
        logger.info("Initiator of the process has user ID = " + initiator);


        logger.info("--- Process variables:");
        Map<String, Object> procVars = execution.getVariables();
        for (Map.Entry<String, Object> procVar : procVars.entrySet()) {
            logger.info(" [" + procVar.getKey() + " = " + procVar.getValue() + "]");
        }

    }


}