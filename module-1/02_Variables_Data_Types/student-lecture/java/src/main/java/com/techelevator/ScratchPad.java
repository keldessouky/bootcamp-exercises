package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {
		//variable declaration
		int 	age; 
		float	averageAge;
		double	averageCost;
		String	name = "Joe";	// both delcaration and assignment
		boolean	isOld = true;
		
		//variable assignment
		age = 17;
		name = "Karim";
		
		String	className = "Math";
		System.out.println(className);
		className = "Biology";
		System.out.println(className);
		
		System.out.println(isOld);
		
		System.out.println("I am in the " + className + " class.");
		//this is called concatination, aka mixing strings and other variables in output
		
		int	month = 12;
		int Month;
		Month = 12;
		System.out.println(month);
		System.out.println(Month); //dont name variables with Capital letter
		String testString = "This is a really" + "\n" + "REALLY long string with " + "\t" + "and you gotta use is sometimes";
		System.out.println(testString);
		
		long x = 10;
		int y = (int) x; //this allows us to tell java to treat a variable as a different data type, provided they both
		//hold the same type of data. to cast the type we want java to treat the data is is added before it in parentheses.
		//as shown in previous example above 	THIS IS CALLED CASTING.
		
		int a = 6;
		int b = 10;
		int value = a % b;
		System.out.println(value);
		
		float val1 = 2.0F; //not assigning it to float by adding F at the end of the value, it defaults to double
		float val2 = val1; //this is fine because val1 is already assigned a float value
		double val5 = 2.0; //defaults as double so dont need to worry
		int xyz = 123454;
		long abc = xyz; //this works because long is larger than int, so whatever fits in int will definitely fit
		//in long. that is not necessarily true vice versa.
		//widening is:
		int smallerNum = 5;
		long biggerNum = smallerNum;
		
		//narrowing is:
		long bigger = 10000000000000L;
		int smaller = (int) bigger;
		
		//truncation?
		
		int w = 7;
		int e = 3;
		
		double z = (double) w / e; //this is called truncation. basically I'm making sure the system understands that w/e is 
		//double not int. i do this to make sure it doesnt get rid of the remainder, so it returns full value.
		
		System.out.println(z);
		
		//
		
		
		
		
		
		
	}

}
