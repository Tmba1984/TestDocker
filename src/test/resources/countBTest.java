package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class countBTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("Alain");
		assertEquals(2, output);
	}

}
