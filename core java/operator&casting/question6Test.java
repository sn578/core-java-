import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class question6Test {

	// Helper method to run main with simulated input and capture output
	private String runMainWithInput(String input) throws Exception {
		InputStream sysInBackup = System.in;
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(out));
		question5.main(new String[]{});
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		return out.toString();
	}

	@Test
	public void testPalindromeNumber() throws Exception {
		String output = runMainWithInput("121\n");
		assertTrue(output.contains("121 is a PALINDROME number."));
	}

	@Test
	public void testNotPalindromeNumber() throws Exception {
		String output = runMainWithInput("123\n");
		assertTrue(output.contains("123 is NOT a palindrome number."));
	}

	@Test
	public void testSingleDigitNumber() throws Exception {
		String output = runMainWithInput("7\n");
		assertTrue(output.contains("7 is a PALINDROME number."));
	}

	@Test
	public void testZero() throws Exception {
		String output = runMainWithInput("0\n");
		assertTrue(output.contains("0 is a PALINDROME number."));
	}

	@Test
	public void testNegativeNumber() throws Exception {
		String output = runMainWithInput("-121\n");
		// Negative numbers are not palindromes in this logic
		assertTrue(output.contains("-121 is NOT a palindrome number."));
	}
}