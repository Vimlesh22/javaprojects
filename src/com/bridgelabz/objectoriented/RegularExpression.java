package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.regularexpression;

public class RegularExpression {

	public static void main(String[] args) {
		Utility utility=new Utility();
		String str="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		
		regularexpression(str);
		
	}

}
