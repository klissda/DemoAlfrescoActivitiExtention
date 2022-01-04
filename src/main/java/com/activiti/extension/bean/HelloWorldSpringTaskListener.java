package com.activiti.extension.bean;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("helloWorldTaskListener")
public class HelloWorldSpringTaskListener implements TaskListener {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldSpringTaskListener.class);

    @Override
    public void notify(DelegateTask task) {
        DelegateExecution execution = task.getExecution();

        logger.info("[Process=" + execution.getProcessInstanceId() +
                "][event=" + task.getEventName() +
                "][TaskListener=" + this +
                "][ActivityId=" + execution.getCurrentActivityId() +
                "][TaskAssignee=" + task.getAssignee() +
                "][TaskForm=" + task.getFormKey() + "]");
    }


}