package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculator {

	int a = 10;
	int b = 5;
	
	CalculatorService cal = new CalculatorService();
	@Test
	public void testSum() {
		Assertions.assertEquals(15, cal.Sum(a, b));
	}
	
	@Test
	public void testDiff() {
		Assertions.assertEquals(5, cal.Diff(a, b));
	}

	
	@Test
	public void testMul() {
		Assertions.assertEquals(50, cal.Mul(a, b));
	}
	
	@Test
	public void testMod() {
		Assertions.assertEquals(0, cal.Mod(a, b));
	}
	
	
	@Test
	public void testIsEqual() {
		Assertions.assertEquals(false, cal.Equal(a, b));
	}
	
}
