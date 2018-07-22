import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFibonacci
{
	@Test
	public void test()
	{
		assertEquals(0, Fibonacci.calculate(0));
		assertEquals(1, Fibonacci.calculate(1));
		assertEquals(1, Fibonacci.calculate(2));
		assertEquals(2, Fibonacci.calculate(3));
		assertEquals(3, Fibonacci.calculate(4));
		assertEquals(5, Fibonacci.calculate(5));
		assertEquals(8, Fibonacci.calculate(6));
		assertEquals(13, Fibonacci.calculate(7));
		
		assertEquals(1134903170, Fibonacci.calculate(45));
	}
}
