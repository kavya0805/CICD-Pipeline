package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {
	
	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void testMsg() {
		MessageService ms = new MessageService();
		System.out.println("Welcome!!!");
		Assertions.assertEquals(ms.welcome(), "Welcome!!!");
	}
	
	@Test
	public void testMessages() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "Welcome!!!");
	}
	
	@Test
	public void testMsgs() {
		MessageService ms = new MessageService();
		System.out.println("Welcome!!!");
		Assertions.assertEquals(ms.welcome(), "hello");
	}

}
