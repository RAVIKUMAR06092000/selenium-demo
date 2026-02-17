package com.basic_java.demo;

public class string_Comparission_And_Validation_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Comparison & Validation
//		Compare two Strings without using equals().
//		Check if two Strings are anagrams.
//		Check if String contains only digits.
//		Check if String contains only alphabets.
//		Check if String contains special characters.
		
		
//		compare_two_strings_without_equals();
//		check_if_two_strings_are_annagrams();
//		String_contains_only_digits();
//		String_contains_only_alphabets();
		string_has_special_characters();

	}
	public static void compare_two_strings_without_equals()
	{
		String str1 = "abe";
		String str2 = "abe";
		int occurance =0;
		if(str1 == str2)
		{
			System.out.println("......................................");
		}
		if(str1.length() != str2.length())
		{
			System.out.print("The 2 strings are not equal...");
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
			
				if(str1.charAt(i) == str2.charAt(i))
				{
					occurance++;
				}
			}
			if(occurance == str1.length())
			{
				System.out.println("The given strings are equal");
			}
			else
			{
				System.out.println("The given strings are not equal");
			}
		}
	}
	
	public static void check_if_two_strings_are_annagrams()
	{
		String str1 = "asples";
		String str2 = "aplpes";
		if(str1.length() == str2.length())
		{
			char[] b = str2.toCharArray();
			boolean isAnagram = true;
			for(int i=0;i<str1.length();i++)
			{
				boolean found = false;
				for(int j=0;j<str2.length();j++)
				{
					if(str1.charAt(i) == b[j])
					{
						found = true;
						b[j] = '*';
						break;
					}
				}
				if(!found)
				{
					isAnagram =false;
					break;
				}
			}
			if((isAnagram == true))
			{
				System.out.println("The given strings are anagram..");
			}
			else {
				System.out.println("The given strings are not anagram....");
			}
		}
		else {
			System.out.println("The given two strings are not anagrams..");
		}
	}
	
	public static void String_contains_only_digits()
	{
		String str = "1234566g";
		char[] c = str.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >='0' && c[i]<='9' )
			{
				count++;
			}
		}
		if(count == str.length())
		{
			System.out.println("The given string has only numbers");
		}
		else
		{
			System.out.println("The given string has some other characters");
		}
	}
	
	public static void String_contains_only_alphabets()
	{
		String str = "alphabets is ";
		str = str.toLowerCase();
		boolean isAlphabet = true;
		for(int i=0;i<str.length();i++)
		{
			if(!((str.charAt(i)>='a' && str.charAt(i)<='z') ||(str.charAt(i) == ' ')))
			{
				isAlphabet = false;
				break;
			}
		}
		
		if(isAlphabet)
		{
			System.out.println("The given string only has alphabets");
		}
		else {
			System.out.println("The given string has some other characters also..");
		}
	}
	
	public static void string_has_special_characters()
	{
		String str = "String has special characters * ";
		str= str.toLowerCase();
		boolean isspecial = false;
		for(int i=0;i<str.length();i++)
		{
			if(!((str.charAt(i)>='a' && str.charAt(i)<='z') || ( str.charAt(i)==' ') || (str.charAt(i)>='0' && str.charAt(i)<='9')))
			{
				isspecial = true;
				break;
			}
		}
		if(isspecial == true)
		{
			System.out.println("The given string has special characters");
		}
		else
		{
			System.out.println("The given string doesnt have any special characters");
		}
	}

}
