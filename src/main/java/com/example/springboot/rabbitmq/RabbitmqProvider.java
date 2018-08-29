package com.example.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqProvider {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        for (int i = 1; i < 2; i++) {
            //点对点
            /*template.convertAndSend("rmq","第"+i+"条消息，收到了吗");*/
            //转发模式
            /*template.convertAndSend("exchange","rmq.Z","第"+i+"条消息，收到了吗");*/
            //广播模式
            template.convertAndSend("exchange","rmq.b","第"+i+"条topic消息");
        }
    }
}
