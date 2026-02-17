package com.basic_java.demo;

public class String_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Basic programs:
//			Reverse a String.
//			Check whether a String is a Palindrome.
//			Count number of characters in a String.
//			Count vowels and consonants in a String.
//			Convert String to lowercase and uppercase.
//			Remove spaces from a String.
//			Replace a character in a String.
//			Find length of a String without using length().
//		ASCIII value for a = 97 and A = 65;

//		reverse_a_string();
//		palindrome();
//		count_no_of_chars();
//		count_no_of_vowels_and_consonents();
//		covert_lower_to_upper();
//		remove_spaces_from_string();
//		replace_a_string();
//		length_of_a_string_without_length();

	}
	
	public static void reverse_a_string()
	{
		String str = "Ravi Kumar";
		char[] str1 = str.toCharArray();  
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
		
		System.out.println("\nUsing STRING BUILDER........");
		
		StringBuilder s = new StringBuilder("Ravi Kumar");
		System.out.println(s.reverse());
		
		System.out.println("Using String buffer");
		StringBuffer sb = new StringBuffer();
		sb.reverse();
		
	}
	
	public static void palindrome()
	{
//		MY LOGIC
//		StringBuilder sb = new StringBuilder("ravi");
//		StringBuilder s = sb.reverse();
//		if(sb.equals(s))
//		{
//			System.out.println(sb+ " The given String is palindrome " + s);
//		}
//		else
//		{
//			System.out.println(sb+" The given string is not palindrome " + s);
//		}
		
//		Chatgpt suggest
//		String s = "ravi";
//		String reverse = new StringBuilder(s).reverse().toString();
//		System.out.println(s.equals(reverse));
		
		String a = "ravi";
		char[] b = a.toCharArray();
		String reverse1 = "";
		for(int i=a.length()-1; i>=0; i--)
		{
			reverse1+= b[i];
		}
		
		if(reverse1.equals(a))
		{
			System.out.println(a +" The given String is palindrome "+ reverse1);
		}
		else
		{
			System.out.println(a+" The given string is not palindrome "+ reverse1);
		}	
	}
	
	public static void count_no_of_chars()
	{
		String a = "Indias";
		System.out.println(a.length());
	}
	
	public static void count_no_of_vowels_and_consonents()
	{
		String a = "Apple123aeiou";
		a=a.toLowerCase();
		char[] b = a.toCharArray();
		int vowels =0, consonents = 0;
		for(int i=0;i<a.length();i++)
		{
//		if they ask for only alphabets or withoutspaces or 
//		if(b[i] != ' ' || (Character.isLetter(b[i]) || (Character.isAlphabetic(b[i]))) ){
//			count++;
//			}
			if(b[i]>='a' && b[i]<='z')
			{
				if(((b[i] == 'a') || (b[i]=='e') || (b[i]=='i') || (b[i]=='o') || (b[i]=='u')))
				{
					vowels++;
				}
				else
				{
					consonents++;
				}
			}
		}
		System.out.println("The vowels count is "+vowels);
		System.out.println("The consonent count is "+ consonents);
	}
	
	public static void covert_lower_to_upper()
	{
		String a = "Elephant is the biggest land animal";
		System.out.println("UPPER CASE: "+ a.toUpperCase());
		System.out.println("lower case: "+ a.toLowerCase());
//		MANUAL CONVERSION TO UPPER CASE
		String s = "abcdefg";
		System.out.println("The original array is "+ s);
		char[] b = s.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>= 'a' && b[i]<='z')
			{
				b[i] = (char) (b[i]-32);
			}
		}
		System.out.println("The upper conversion is " + new String(b));
		
//		TO LOWER CASE
		for(int i=0;i<s.length();i++)
		{
			if(b[i]>='A' && b[i]<='Z')
			{
				b[i] = (char) (b[i]+32);
			}
		}
		System.out.println("The lower conversion is " + new String(b));	
	}
	
	public static void remove_spaces_from_string()
	{
		String a = "This is the code for removing spaces";
		String[] b = a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}
	
	public static void replace_a_string()
	{
		String a = "This code is for replace a string prereplace predreplace";
		String[] str = a.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("replace"))
			{
				str[i] = "replacing";
			}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
//		CHATGPT LOGIC
		String result = a.replace("replace", "replacing");
		System.out.println("\n"+result);
//		If needed to change all the replace even if the word is inside another word then use
//		String replace = a.replaceAll("\\breplace\\b", "replacing");
//		System.out.println("\n"+result);
	}
	
	public static void length_of_a_string_without_length()
	{
		String str = "To find length of a string without length";
		char[] a = str.toCharArray();
		int count=0;
		for(char b: a)
		{
			count++;
		}
		System.out.println("The length of a given string is "+ count);
	}
	
	
	

}
