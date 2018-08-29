package com.example.springboot;

import com.example.springboot.activemq.ActivemqProvider;
import com.example.springboot.rabbitmq.RabbitmqProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Resource
	private RabbitmqProvider rabbitmqProvider;
	@Resource
	private ActivemqProvider activemqProvider;

	@Test
	public void rabbitmqSend() {
		rabbitmqProvider.send();
	}

	@Test
	public void activemqSend() {
		activemqProvider.send("amq","第一条消息");
	}

	@Test
	public void activemqPublish() {
		activemqProvider.publish("amq","第一条Topic消息");
	}

}
