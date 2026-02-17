package com.basic_java.demo;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class Array_programs {
	static int[] array = {12,23,34,5,32,56,365,234,7,340};
	static int[] array1 = {100,20,30,20,45,12,59,4};
	static int[] array2 = {1,2,3,4,5,6,7,8,9,10};
	static int temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Types of array declaration
		int[] arr;
		int arr1[];
		int[] arr2 = new int[5];
		int[] arr3 = {12,23,34,45,56,67,78,234,89};
		
		int[] arr4;
		arr = new int[] {12,12,12,12,121,5};
//		arr4= {12,12,12} ;   // This is wrong once we declaed we need to intialize with the help of new keyword.
		
		int[] arr5 = {12,14,67,234,6,23,97,232,34};
		
//		Scanner sc = new Scanner(System.in);
//		String[] arr6 = new String[3];
//		for(int i=0;i<arr6.length;i++)
//		{
//			arr6[i] = sc.next();
//		}
		
		// MULTI-DIMENSIONAL ARRAY
		int[][] arr7 = new int[5][3];
//		{12,23,34,5,32,56,365,234,7};
//		int[] array1 = {10, 100, 20, 30, 40};
//		int[] array1 = {10, 20, 30};
//		int[] array1 = {50, 10, 40, 30};
		
//		largest_element_in_an_array();
//		smallest_element_in_an_array();
//		second_largest_element_in_an_array();
//		second_smallest_element_in_an_array();
//		even_and_odd_count_numbers();
//		reverse_an_array_in_place();
//		copy_one_array_to_other();
//		check_if_an_array_is_sorted();
//		sum_and_average_of_array_of_elements();
//		search_an_element();
//		remove_duplicates_from_an_array();
//		sort_an_array();
//		remove_duplicates_from_an_array();
//		find_missing_numbers();
//		find_duplicates_elements();
//		frequency_of_an_array();
//		move_all_zero_to_end();
//		rotate_array_left();
//		rotate_array_right();
//		merge_two_arrays();
//		intersection_of_two_elements();
//		split_arrays_into_odd_and_even();
		bubble_sort();
		
	}
	
	// PROGRAMS:
	public static void largest_element_in_an_array()
	{
		// LARGEST ELEMENT IN AN ARRAY
		int max= array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("LARGEST ELEMENT IN AN ARRAY IS : "+ max);
	}
	
	public static void smallest_element_in_an_array()
	{
		// SMALLEST ELEMENT IN AN ARRAY
		int min =array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.println("SMALLEST ELEMENT IN AN ARRAY IS : "+ min);
		
	}
	
	public static void second_largest_element_in_an_array()
	{
		//	SECOND LARGEST ELEMENT IN AN ARRAY
		int fir_largest = array1[0];
		int sec_largest = Integer.MIN_VALUE;
		for(int i=1;i<array1.length;i++)
		{
			if(array1[i]>fir_largest)
			{
				sec_largest = fir_largest;
				fir_largest = array1[i];
			}
			else if((sec_largest <array1[i]) && (array1[i]!=fir_largest))
			{
				sec_largest= array1[i];
			}
		}
		System.out.println("Second largest element in an array is "+ sec_largest);
	}
	
	public static void second_smallest_element_in_an_array()
	{
		// SECOND SMALLEST VALUE 
		int fir_smallest = array1[0];
		int sec_smallest = Integer.MAX_VALUE;
		for(int i=1;i<array1.length;i++)
		{
			if(array1[i] <fir_smallest)
			{
				sec_smallest  = fir_smallest;
				fir_smallest = array1[i];
			}
			else if(array1[i] < sec_smallest && array1[i] != fir_smallest)
			{
				sec_smallest = array1[i];
			}
		}
		System.out.println("Second smallest element in an array is "+ sec_smallest);
	}
	
	public static void even_and_odd_count_numbers()
	{
		// COUNT EVEN AND ODD NUMBERS IN AN ARRAY
		int odd_count =0;
		int even_count =0;
		for(int i=0;i<array2.length;i++)
		{
			if(array2[i]%2 == 0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Number of odd count is : "+odd_count );
		System.out.println("Number of even count is : "+ even_count);
	}
	
	public static void reverse_an_array_in_place()
	{
		// REVERSE AN ARRAY IN PLACE
		int simple = 0;
		int length = array2.length;
		for(int i=0,j=length-1;i<length/2;i++,j--)
		{
			simple = array2[i];
			array2[i] = array2[j];
			array2[j] = simple;
		}
		for(int j=0;j<array2.length;j++)
		{
			System.out.println(array2[j]);
		}
	}
	
	public static void copy_one_array_to_other()
	{
		// COPY ONE ARRAY TO ANOTHER
		int[] array3 = new int[array2.length];
		for(int i=0;i<array2.length;i++)
		{
			array3[i] = array2[i];
		}
		// Printing the array
		
		for(int j=0;j<array3.length;j++)
		{
			System.out.print(array3[j]+" ");
		}
		System.out.println();
		// chatgpt version
		int[] array3_1 = new int[array2.length];
		
		System.arraycopy(array2, 0, array3_1, 0, array2.length);
		for(int j=0;j<array3_1.length;j++)
		{
			System.out.print(array3_1[j]+" ");
		}
	}
	
	public static void check_if_an_array_is_sorted()
	{
		// Check if an array is sorted or not
		boolean issorted = true;
		int[] array2 = {1,2,2,4,3};
		for(int i=0;i<array2.length-1;i++)
		{
			if(array2[i]>array2[i+1])
			{
				issorted = false;
				break;
			}
		}
		if(issorted)
		{
			System.out.println("The Array is in sorted format ");
		}
		else
		{
			System.out.println("The array is not in sorted format ");
		}
	}
	
	public static void sum_and_average_of_array_of_elements()
	{
		// Finding the sum and average of the array
		int sum=0;
		for(int i=0;i<array2.length;i++)
		{
			sum = sum+array2[i];
		}
		double average = sum/array2.length;
		System.out.println("Sum of the array elements is " + sum);
		System.out.println("Average of the array elements is "+ average);
	}
	
	public static void search_an_element()
	{
		// Using linear search
		Scanner sc =new Scanner(System.in);
		int[] array3 = {12,4,1,13,67,24,86,78,100};
		int index =0 ,a= sc.nextInt();
		boolean valueFound = false;
		for(int i=0;i<array3.length;i++)
		{
			if(array3[i] == a)
			{
				index = i;
				valueFound = true;
				break;
			}
		}
		if(valueFound)
		{
			System.out.println("The value a("+ a +") is present in the index "+ index);
		}
		else
		{
			System.out.println("The given value is not found in the array");
		}
	}
	
	public static void sort_an_array()
	{
		int[] array3 = {12,4,1,13,67,24,86,78,100};
		int swap;
		for(int i=0;i<array3.length;i++)
		{
			for(int j=i;j<array3.length;j++)
			{
				if(array3[i]>array3[j])
				{
					swap = array3[i];
					array3[i]=array3[j];
					array3[j]=swap;
				}
			}
		}
		for(int k=0;k<array3.length;k++)
		{
			System.out.print(array3[k]+", ");
		}		
	}
	
	public static void remove_duplicates_from_an_array()
	{
		int[] array = {1,2,3,4,5,6,7,8,9,2,4,6,8,9,10};
		int[] array1 = new int[array.length];
		int k;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					k=array[i];
					array[i]=array[j];
					array[j]=k;
				}
			}
		}
		int count =0;
		for(int j=0;j<array.length-1;j++)
		{
			if(array[j] == array[j+1])
			{
				count++;
			}
			System.out.print(array[j]);
		}
		int size = array.length-count;
		System.out.println("Count : "+count+ " Size: "+ size + " Length : "+ array.length);
		int[] array2 = new int[size];
		int j=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i] != array[i+1])
			{
				array2[j] = array[i];
				j++;
			}
		}
		array2[j] = array[array.length-1];
		for(int c=0;c<array2.length;c++)
		{
			System.out.print(array2[c]+" ");
		}
	}
	
	public static void find_missing_numbers()
	{
		int array[] = {2,3,4,6,8,9,12,24};
		
		for(int i=0;i<array.length-1;i++)
		{
			int current = array[i];
			int next = array[i+1];
			while(current+1 < next)
			{
				System.out.print(current+1+" ");
				current++;
			}
		}
	}
	
	public static void find_duplicates_elements()
	{
		int[] arr = {1,2,3,2,5,6,4,8,2,0,1,4};
		int k=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}
		for(int j=0;j<arr.length-1;j++)
		{
//			System.out.println(arr[j]);
			if(arr[j] == arr[j+1])
			{
				System.out.print(arr[j]+ " ");
			}
		}
	}
	
	public static void frequency_of_an_array()
	{
		int[] arr = {1,1,3,3,5,2,6,7,4,8,9,9};
		
		for(int i=0;i<arr.length;i++)
		{
			int count =1,temp;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int count =1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] == arr[i+1])
			{
				count++;
			}
			else {
				System.out.println(arr[i]+" count is "+ count);
				count =1;
			}
		}
		System.out.println(arr[arr.length-1] + " count is "+count);
	}
	
	public static void move_all_zero_to_end()
	{
		int[] arr = {0,1,0,2,0,3};
		int temp,k=0;
		for(int i=0;i<arr.length;i++)
		{
			// MY LOGIC 
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if((arr[i] == 0))
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
			if(arr[i]!=0)
			{
				arr[k] = arr[i];
				k++;
			}
		}
		while(k<arr.length)
		{
			arr[k]=0;
			k++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate_array_left()
	{
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();		
		int[] arr = {1,2,3,4,5,6,7};
		
		if(arr.length >a)
		{
			for(int i=0;i<a;i++)
			{
				int k=0;
				temp = arr[0];
				// MY LOGIC 
//				for(int j=1;j<arr.length;j++)
//				{
//					if(j == arr.length-1)
//					{
//						arr[k] = temp;
//						k++;
//					}
//					else
//					{
//						arr[k] = arr[j];
//						k++;
//					}
//				}
				// chatgpt answer
				for(int j=0;j<arr.length-1;j++)
				{
					arr[j] = arr[j+1];
				}
				arr[arr.length-1] = temp;
			}
		}
		else
		{
			System.out.println("The given rotation count is greater than the size of the array".toUpperCase());
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate_array_right()
	{
		int[] arr = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<arr.length)
		{
//			MY LOGIC:
//			for(int i=arr.length-1;i>arr.length-1-a;i--)
			for(int i=0;i<a;i++)
			{
				temp = arr[arr.length-1];
				for(int j=arr.length-2;j>=0;j--)
				{
					arr[j+1] = arr[j];
				}
				arr[0] = temp;
			}
		}
		else
		{
			System.out.println("The give number is larger than the array size");
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
	
	public static void merge_two_arrays()
	{
		int arr[] = {1,2,3,4,5,200};
		int[] arr1 = {6,7,8,9,10,100};
		int length = arr.length+arr1.length;
		int arr2[] = new int[length];
		for(int i=0,j=0 ; i<length ; i++)
		{
			if(i<arr.length)
			{
				arr2[i] = arr[i];
			}
			else 
			{
				arr2[i] = arr1[j];
				j++;
			}
		}
		for(int i=0;i<length ; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
	
	public static void intersection_of_two_elements()
	{
		int[] arr1 = {1,3,4,2,6,8,9,1,2,3,4,5,6};
		int[] arr = {1,7,3,9,8,2,6,6,4,3,2,1};
//		MY LOGIC
		//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr1.length;j++)
//			{
//				if(arr[i] == arr1[j])
//				{
//					System.out.print(arr[i]+ " ");
//					break;
//				}
//			}
//		} 
//		1 3 9 8 2 6 6 4 3 2 1  with break
//		1 1 3 3 9 8 2 2 6 6 6 6 4 4 3 3 2 2 1 1  without break
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
		    boolean alreadyPrinted = false;
		    for(int k=0;k<i;k++)
		    {
		        if(arr[i] == arr[k])
		        {
		            alreadyPrinted = true;
		            break;
		        }
		    }
		    if(alreadyPrinted)
		        continue;
		    for(int j=0;j<arr1.length;j++)
		    {
		        if(arr[i] == arr1[j])
		        {
		            System.out.print(arr[i] + " ");
		            break;
		        }
		    }
		}
	}
	
	public static void split_arrays_into_odd_and_even()
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int odd_count = 0;
		int even_count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		 int[] odd_arr = new int[odd_count];
		 int[] even_arr = new int[even_count];
		 System.out.println("Odd Count is "+ odd_count + " Even Count is "+ even_count);
		 for(int i=0,j=0,k=0;i<arr.length;i++)
		 {
			if(arr[i]%2 == 0)
			{
				even_arr[j] = arr[i];
				j++;
			}
			else {
				odd_arr[k] = arr[i];
				k++;
			}
		 }
		 System.out.println("ODD ARRAY COUNT");
		 for(int i=0;i<odd_arr.length;i++)
		 {
			 System.out.print(odd_arr[i]+" ");
		 }
		 System.out.println();
		 System.out.println("EVEN ARRAY COUNT");
		 for(int i=0;i<even_arr.length;i++)
		 {
			 System.out.print(even_arr[i] + " ");
		 }
	}
	
	public static void bubble_sort()
	{
		int arr[] = {9,8,7,6,5,4,3,2,1};
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
