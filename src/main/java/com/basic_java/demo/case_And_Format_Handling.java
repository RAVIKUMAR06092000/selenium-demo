package com.basic_java.demo;

public class case_And_Format_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Convert first letter of each word to uppercase.
//		Toggle case of each character.
//		Convert String to title case.
//		Remove all vowels from a String.
		
//		convert_first_letter_of_each_word_to_uppercase();
//		toggle_case_of_each_character();
//		String_to_title_case();
		remove_vowels_from_a_string();
		

	}
	
	public static void convert_first_letter_of_each_word_to_uppercase()
	{
		String str = "This is india and the food here is very tasty ";
//		str = str.toLowerCase();
		String[] a = str.trim().split("\\s+");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			char[] b = a[i].toCharArray();
			for(int j=0;j<b.length;j++)
			{
				if(j==0)
				{
					b[0] = Character.toUpperCase(b[0]);
//					b[0] = (char) (b[0] - 32); 
//					we can also use this my idea
//					This line i have used b[0] = b[0].toUpperCase(); but that is not right way 
//					because the char is a primtive data type it doesnt have any inbuild values we need to make it as
//										b[0] = Character.toUpperCase(b[0]);
				}
				System.out.print(b[j]);
			}
			System.out.print(" ");
		} 
	}
	
	public static void toggle_case_of_each_character()
	{
		String str = "Toogle case of each character TASF";
		char[] a = str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i] = (char)(a[i] -32);
			}
			else if(a[i]>='A' && a[i]<='Z')
			{
				a[i] = (char)(a[i] + 32);
			}
			System.out.print(a[i]);
		}
	}
	
	public static void String_to_title_case()
	{
		String str = "ConvERERrt string case to title case";
		String[] s = str.trim().split("\\s+"); 
		for(int i=0;i<s.length;i++)
		{
			char[] c = s[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if((j==0) && (c[j]>='a' && c[j]<='z'))
				{
					c[j] = (char)(c[j]-32);
				}
				else if((j>=1) && (c[j]>='A' && c[j]<='Z'))
				{
					c[j] = (char)(c[j]+32);
				}
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
	}
	
	public static void remove_vowels_from_a_string()
	{
		String str = "Remove vowels from a string";
		char[] ch = str.toCharArray();
		String empty ="";
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'i') || (ch[i] == 'o') || (ch[i] == 'u') || 
					(ch[i] == 'A') || (ch[i] == 'E') || (ch[i] == 'I') || (ch[i] == 'O') || (ch[i] == 'U'))
			{
				ch[i] = '*';
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='*')
			{
				empty = empty + ch[i];
			}
		}
		System.out.println(empty);
	}
	

}
