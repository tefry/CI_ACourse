import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFibonacciParametized
{
	private final int input, expected;	
	
  	@Parameters
	public static List<Object[]> data()
	{
		return Arrays.asList(new Object[][] {{0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 45, 1134903170 } });
	} 
	
	public TestFibonacciParametized(int input, int expected)
	{
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void test()
	{
		assertEquals(expected, Fibonacci.calculate(input));
	}

}
