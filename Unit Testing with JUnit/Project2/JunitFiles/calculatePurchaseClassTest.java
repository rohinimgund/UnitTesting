package com.uta.controllerTest;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import com.uta.controller.*;

@RunWith(JUnitParamsRunner.class)

public class calculatePurchaseClassTest {
		
		//private calculatePurchaseClass calcP1;
		
		
		@SuppressWarnings("unused")
		private static final Object[] parametersForProb3()
		{
			return $(
//					Parameters are: (1,2,3,4,5,6)
//					1=total, 2=existingMember, 3=validDiscount, 4=validCoupon, 5=purchaseTotal_res,	6=discountApplied_res 				
//					Test case 1
					$(1000,true,true,true,850,true),
//					Test case 2
					$(1000,true,false,true,1000,true),
//					Test case 3
					$(1000,false,true,false,1000,true),
//					Test case 4
					$(1000,true,true,false,850,true),
//					Test case 5
					$(1000,false,false,true,850,true),
//					Test case 6
					$(1000,true,false,false,1000,false),
//					Test case 7
					$(1000,false,true,true,850,true),
//					Test case 8
					$(1000,false,false,false,1000,false)

					);
		}
		
				
		
		@Test
		@Parameters(method="parametersForProb3")
		
		public void testcalcPurchase(double total, boolean existingMember, boolean validDiscount, boolean validCoupon, double purchaseTotal_res, boolean discountApplied_res){
			calculatePurchaseClass calcP1 = new calculatePurchaseClass(); 
			calcP1.calcPurchase(total,existingMember,validDiscount, validCoupon);
			assertEquals(purchaseTotal_res,calcP1.getPurchaseTotal(),0.01);
			assertEquals(discountApplied_res,calcP1.isDiscountApplied());
		}
		
}
