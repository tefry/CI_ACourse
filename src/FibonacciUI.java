import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciUI {

	/**
	 * Main entry point for the UI.
	 * 
	 * @param args
	 *            Command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		long input = 0, result;
		boolean keepRunning = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (keepRunning == true) {
			System.out.println("Enter Integer to Calculate Fibonacci value, or q to quit:");
			String inputString;
			try {
				inputString = br.readLine();
			} catch (IOException e) {
				System.err.println("Read failed.");
				keepRunning = false;
				continue;
			}
			if (inputString.contains("q")) {
				keepRunning = false;
				continue;
			} else {
				try{
					input = Long.parseLong(inputString);
				}catch(NumberFormatException nfe ){
					System.err.println("Invalid Format! Did you enter a integer?");
					continue;
				}
				result = Fibonacci.calculate(input);
				System.out.println("Fibonacci result is: " + result);
			}
		}
		System.out.println("Exiting");
	}

}
