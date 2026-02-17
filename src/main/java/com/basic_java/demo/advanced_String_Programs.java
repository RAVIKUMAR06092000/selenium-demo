package com.basic_java.demo;

public class advanced_String_Programs {

//	Find maximum occurring character.
//	Find minimum occurring character.
//	Find substring count.
//	Rotate a String left/right.
//	Check if String is a rotation of another.
//	Print all substrings of a String.
//	Check if String is Pangram.
//	Remove characters from one String present in another
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_maximum_occuring_character();
		find_minimum_occuring_character();

	}
	public static void find_maximum_occuring_character()
	{
		String str = "I love india aaaaaa     ";
		str = str.toLowerCase().replace(" ", "_");
		char[] ch = str.toCharArray();
		int max =0;
		char c =' ';
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '*')
				continue;
			int count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if((ch[i] == ch[j])&& (ch[i]!='*'))
				{
					ch[j] = '*';
					count++;
				}
			}
			if(count>max)
			{
				max = count;
				c=ch[i];
			}
		}
		System.out.println("The maximum repeating character in a string is "+c + " with count "+ max);
	}
	
	public static void find_minimum_occuring_character()
	{
		
	}

}
