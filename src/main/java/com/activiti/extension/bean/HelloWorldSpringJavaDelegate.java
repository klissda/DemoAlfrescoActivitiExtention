package com.activiti.extension.bean;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorldSpringJavaDelegate implements JavaDelegate {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldSpringJavaDelegate.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        logger.info("[Process=" + execution.getProcessInstanceId() +
                "][Spring Java Delegate=" + this + "]");
    }
}