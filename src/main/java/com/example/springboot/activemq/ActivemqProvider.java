package com.example.springboot.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Destination;

@Component
public class ActivemqProvider {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 点对点模式
     * @param destinationName
     * @param message
     */
    public void send(String destinationName,String message){
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination,message);
    }

    /**
     * 发布订阅模式
     * @param destinationName
     * @param message
     */
    public void publish(String destinationName,String message){
        Destination destination = new ActiveMQTopic(destinationName);
        jmsMessagingTemplate.convertAndSend(destination,message);
    }
}
