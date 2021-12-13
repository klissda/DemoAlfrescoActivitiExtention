package com.activiti.extension.bean;


import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldTaskListener implements TaskListener {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldTaskListener.class);

    @Override
    public void notify(DelegateTask task) {
        DelegateExecution execution = task.getExecution();
        logger.info("[Process=" + execution.getProcessInstanceId() + "][event=" + task.getEventName() + "][TaskListener=" + this + "][ActivityId=" + execution.getCurrentActivityId() + "][TaskAssignee=" + task.getAssignee() + "][TaskForm=" + task.getFormKey() + "]");
    }
    
}