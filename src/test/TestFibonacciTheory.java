import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestFibonacciTheory
{

	@DataPoints
	public static int[] VALUES =
	{ 0, 1, 2, 3, 45 };

	@Theory
	public void seeds(int n)
	{
		assumeTrue(n <= 1); // ignores values > 1
		assertEquals(n, Fibonacci.calculate(n));
	}

	@Theory
	public void recurrence(int n)
	{
		assumeTrue(n > 1); // ignores values <= 1
		assertEquals(Fibonacci.calculate(n - 1) + Fibonacci.calculate(n - 2), Fibonacci.calculate(n));
	}
}
