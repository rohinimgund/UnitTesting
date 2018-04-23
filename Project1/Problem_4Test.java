package Homework_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junitparams.JUnitParamsRunner;

import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem_4Test {

	Problem_4 prb4;
	
	@Before
	public void setUp() {
		prb4 = new Problem_4();
	}
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_4Test () {
		return $(
//					Parameters are: (1,2,3,4,5)
//							1=invoice, 2=credit, 3=balance, 4=interest,5=exp_out
//				Test case 1
				$(	2_999.99,	5_000.01,	1_499.99,	0.12,	true),
//				Test case 2
				$(  3_000.00,	5_000.01,	1_499.99,	0.12,	false),
//				Test case 3
				$(  2_999.99,	5_000.00,	1_499.99,	0.12,	false),
//				Test case 4
				$(  2_999.99,	5_000.01,	1_500.00,	0.12,	false),
//				Test case 5
				$(  2_999.99,	5_000.01,	1_499.99,	0.13,	false),
//				Test case 6 
				$(  0.00,		5_000.01,	1_499.99,	0.12,	true),
//				Test case 7 
				$(	10_000.00,	5_000.01,	1_499.99,	0.12,	false),
//				Test case 8 
				$(  2_999.99,		0.00,	1_499.99,	0.12,	false),
//				Test case 9 
				$(  2_999.99,	10_000.00,	1_499.99,	0.12,	true),
//				Test case 10 
				$(  2_999.99,	10_000.00,	10_000.00,	0.12,	false),
//				Test case 11 
				$(  2_999.99,	10_000.00,		0.00,	0.12,	true),
//				Test case 12 
				$(  2_999.99,	10_000.00,		0.00,	0.00,	true),
//				Test case 13 
				$(  2_999.99,	10_000.00,		0.00,	0.40,	false)
		);
	}
	
	@Test
	@Parameters(method="parametersForProblem_4Test")
	public void test (double invoice,double credit, double balance, double interest, boolean exp_out) {
		assertEquals(exp_out,prb4.isCreditIncreasable(invoice, credit, balance, interest));
		}
}