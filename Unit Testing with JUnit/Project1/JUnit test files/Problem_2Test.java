package Homework_5;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem_2Test {

	Problem_2 prb2;
	int x,y;
	boolean one, two;
	
	@Before
	public void setUp() {
		prb2 = new Problem_2();
	}
	
	public Problem_2Test (int x,boolean one, boolean two, int y) {
		this.x=x; this.y=y; this.one=one;this.two=two;this.y=y;
	}
	
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
        		// Parameters are (1,2,3,4) 
        		//        1=x,2=one,3=two,4=y (exp result)
        		{ 5,	true,	true,	3}, 
                { 5,	false,	true,	3}, 
                { 5,	false,	false,	5}

           });
    }
	
	@Test
	public void test () {
		// Default value of a boolean in Java is false
		assertEquals(y,prb2.returnInput(x, one, two));
		}
}
