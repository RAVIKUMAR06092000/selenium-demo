package com.basic_java.demo;

public class WordBasedStringPrograms {
	
//	Word-Based String Programs
//		Count number of words in a String.
//		Reverse each word in a String.
//		Reverse words but keep sentence order.
//		Find longest word in a String.
//		Find shortest word in a String.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		count_no_of_words_in_a_string();
//		reverse_each_word();
//		reverse_words_but_keep_sentence_order();
//		find_longest_word_in_a_string();
		find_shortest_word_in_a_string();

	}
	
	public static void count_no_of_words_in_a_string()
	{
		String str = "count no of words in a string";
		String[] s = str.split(" ");
//		CHATGPT LOGIC
//		String[] words = str.trim().split("\\s+");
//		\\s → any whitespace (space, tab, newline)
//		+ → one or more
		int count=0;
		System.out.println(s.length);
//		MANUAL METHOD WITHOUT LENGTH()
		for(String s1: s)
		{
			count++;
		}
		System.out.print("The count of words in the given string is "+ count);
	}
	
	public static void reverse_each_word()
	{
		String str = "    d  reverse each word in a string";
		String[] a = str.trim().split("\\s+");
		for(int j=0;j<a.length;j++)
		{
			char[] c = a[j].toCharArray();
			for(int k=c.length-1;k>=0;k--)
			{
				System.out.print(c[k]);
			}
			System.out.print(" ");
		}
		System.out.println();
//		USING STRINGBUILDER
		for(String word: a)
		{
			String sb = new StringBuilder(word).reverse().toString();
			System.out.print(sb+" ");
		}
	}
	
	public static void reverse_words_but_keep_sentence_order()
	{
		String str = "Reverse each words with order";
		String[] a = str.trim().split("\\s+");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void find_longest_word_in_a_string()
	{
		String str = "find longes word in a string ";
		String[] a = str.trim().split("\\s+");
		String max="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length() > max.length())
			{
				max = a[i];
			}
			
		}
		System.out.println("The longest word in the string is : ("+ max + ") with length: "+ max.length());
	}
	
	public static void find_shortest_word_in_a_string()
	{
		String str = "find shortest word in a given string";
		String[] s = str.split("\\s+");
		String count = s[0];
		for(int i=1;i<s.length;i++)
		{
			if(s[i].length() < count.length())
			{
				count = s[i];
			}
		}
		System.out.println(count);
//		some improvements by chatgpt is wht if the string is empty it will throw outofbound exception...
	}

}
