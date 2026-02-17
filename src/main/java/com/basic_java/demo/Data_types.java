package com.basic_java.demo;

public class Data_types {

	public static void main(String[] args) {
		
		// Data_types
		// Primitive_data_types
		//These store actual values and are not objects.
			// 1. integer data types
			byte a = 127;  						// -128 to 127  						(1 byte)
			short b = 30000;					// -32768 to 32767						(2 byte)
			int c = 1000000000;					// -2,147,483,648 to 2,147,483,647 		(4 byte)
			long d = 9223372036854775807l;		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 byte)
			System.out.println(a+" : "+ b +" : "+ c +" : "+ d );
			
			// 2. Floating  point types
			double e = 12.3;		// ~ 7 digits	(4 bytes)
			float f = 123.67f;		// ~ 15 digits  (8 bytes)
			System.out.println(e +" : "+ f);
			
			// 3. Character types
			char g = 'w';			// Stores a single unicode character (2 byte)
			System.out.println(g);  // 'A' - 65 , 'a' - 97 
									// numbers '0' to '9' - 48 to 57 
									// space ' ' - 32
			
			// 4. Boolean types
			boolean h = true;		// Stores true or false (1 byte)
			System.out.println(h);
			
			// Default values for all data types are 0 and for boolean its false.
			
		// Non-Primitive data_type  or reference types
		// These store references (addresses) to objects, not the actual value.
			// Common non-primitive data_types are:
			// String, Array, class, interface, objects.
			
			String i = "Ravi Kumar";
			int[] j = {1,2,3};
			
			
	}

}
