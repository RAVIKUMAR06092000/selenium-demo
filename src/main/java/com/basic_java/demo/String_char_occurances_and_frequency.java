package com.basic_java.demo;
import java.util.*;

public class String_char_occurances_and_frequency {
//	Character Occurrence & Frequency
//		Count frequency of each character.
//		Find first non-repeated character.
//		Find first repeated character.
//		Count occurrence of a character in a String.
//		Remove duplicate characters from a String.
//		Print duplicate characters in a String.


	public static void main(String[] args) {
		
//		count_frequency_of_each_char();
//		first_non_repeating_char();
//		first_repeated_char();
//		find_occurance_of_a_char();
//		remove_duplicate_char_from_a_string();
		print_duplicate_char_from_string();
		

	}
	public static void count_frequency_of_each_char()
	{
		String a = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
		a=a.toLowerCase();
		char[] ch = a.toCharArray();
		for( int i=0; i<ch.length; i++ )
		{
			int count=1;
			if(ch[i] == '*')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '*';
				}
			}
			System.out.println("The count of the char is "+ ch[i] + " = "+ count);
		}
		
//		SECOND MANUAL METHOD BY YOUTUBE
		for(char c='a';c<'z';c++)
		{
			int count =1;
			for(int i=0;i<ch.length;i++)
			{
				if(c == ch[i])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("The count of char is "+ c +" "+ count);
			}
		}
	}
	
	public static void first_non_repeating_char()
	{
		String str = "aabbccddefa";
		str=str.toLowerCase();
		char[] a = str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(a[i] =='*')
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='*';
				}
			}
			if(count==0)
			{
				System.out.println("The first non repeating char in the string is "+ a[i]);
				break;
			}
		}
	}
	
	public static void first_repeated_char()
	{
		String str = "first repeated char";
		char[] a = str.toCharArray();
		boolean isrepeated =true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("The first repeated char in the string is "+ a[i]);
					isrepeated = false;
					break;
				}
			}
			if(isrepeated == false)
			{
				break;
			}
		}
	}
	
	public static void find_occurance_of_a_char()
	{
		String str = ("aabbccc dddeeeffrrgghijjjkkklll").toLowerCase();
//		MY LOGIC
		char[] c = str.toCharArray();
		
		Scanner sc = new Scanner(System.in);		
		char ch = sc.next().charAt(0);
		int count =0;
		for(int i=0;i<c.length;i++)
		{
			if(ch == c[i])
			{
				count++;
			}
//			CHATGPT LOGIC Need not initialize the char[] c
//			if(ch == str.charAt(i))
//			{
//				count++;
//			}
		}
		System.out.println("The occurance of the char "+ch+ " is "+count);	
	}
	
	public static void remove_duplicate_char_from_a_string()
	{
		String str = "remove duplicate char from a string";
		char[] c = str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == '*')
				continue;	
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[j] ='*';
				}
			}
		}
		for(int i=0;i<c.length ;i++)
		{
			if(c[i]!='*')
			{
				System.out.print(c[i]);	
			}
		}
	}
	
	public static void print_duplicate_char_from_string()
	{
		String str = "aaabbccdeffghiijjkk";
		char[] c = str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int count =0;
			if(c[i]=='*')
				continue;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					count++;
					c[j]='*';
				}
			}
			if(count>0)
			{
				System.out.println(c[i]);
			}
		}
	}

}
