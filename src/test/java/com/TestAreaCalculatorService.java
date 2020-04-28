package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class TestAreaCalculatorService {

	int param1 = 10;
	int param2 = 10;
	
	AreaCalculatorService ac = new AreaCalculatorService();
	
	@Test
	public void testSquare(){
		Assertions.assertEquals(100, ac.square(param1));
	}
	
	@Test
	public void testRectangle(){
		Assertions.assertEquals(100, ac.rectangle(param1, param2));
	}
	
	@Test
	public void testCircle(){
		Assertions.assertEquals(314.1592653589793, ac.circle(param1));
	}
	
	@Test
	public void testSqr(){
		Assertions.assertEquals(200, ac.square(param1));
	}
	
	@Test
	public void testRect(){
		Assertions.assertEquals(200, ac.rectangle(param1, param2));
	}
	
	@Test
	public void testCir(){
		Assertions.assertEquals(100, ac.circle(param1));
	}
	
}
