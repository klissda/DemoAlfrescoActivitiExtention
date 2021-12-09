package com.activiti.extension.bean;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("getEmployeeData")
public class EmployeeClass implements JavaDelegate {
    private final Logger logger = LoggerFactory.getLogger(EmployeeClass.class);


    public void execute(DelegateExecution execution) throws Exception {
        this.logger.info("[Process=" + execution.getProcessInstanceId() + "][Spring Java Delegate=" + this + "]");
        try {
            execution.setVariable("apiSuccess", false);
            String docNo = (String) execution.getVariable("docNo");
            this.logger.info("[docNo] value : " + docNo);
            execution.setVariable("apiSuccess", true);
        } catch (Exception var3) {
            this.logger.error("[H01ASAPDelegate] failed", var3);
        }

    }
}