package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class squareTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
