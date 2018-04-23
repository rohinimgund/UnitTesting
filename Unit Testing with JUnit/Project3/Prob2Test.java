package Homework8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Prob2Test {
	private int x;
	private int y;
	private boolean one;
	private boolean two;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			// Parameters are: (1,2,3,4)
			// 1=x, 2=one, 3=two, 4=y
			
			// TestCase 1
			{ 5,3, true, true},
			// TestCase 2
			{ 5, 3, false, true},
			// TestCase 3
			{ 5, 5, false, false	},
			// TestCase 4
			{ 5,7, true, false}
			});
	}
	public Prob2Test(int x, int y, boolean one, boolean two) {
		super();
		this.x = x;
		this.y = y;
		this.one = one;
		this.two = two;
	}

	@Test
	public void test() {
		Prob2 problem = new Prob2();
		assertEquals(y, problem.returnInput(x, one, two));
	}

}
