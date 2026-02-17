package com.basic_java.demo;

import java.util.Scanner;

//import java.lang;

public class Looping_programs
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		square_pattern_1(a);
		right_angled_triangle_1(a);
		no_in_triangle_1(a);
		same_no_in_each_row_1(a);
		
		inverted_right_angle_triangle_2(a);
		inverted_no_triangle_2(a);
		character_pattern_2(a);
		repeated_character_per_row_2(a);
		right_aligned_triangle_3(a);
		pyramid_3(a);
		inverted_pyramid_3(a);
		continious_numbesr_4(a);
		number_pyramid_4(a);
		alternative_number_4(a);
		hollow_square_5(a);
		x_pattern_5(a);
		diamond_pattern_5(a);
		hollow_diamond_6(a);
		
	}
	
	public static void square_pattern_1(int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void right_angled_triangle_1(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void no_in_triangle_1(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void same_no_in_each_row_1(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	
	public static void inverted_right_angle_triangle_2(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void inverted_no_triangle_2(int a)
	{
		for(int i=a;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void character_pattern_2(int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)('A' + j) + " ");
				
			}
			System.out.println();
		}
	}
	
	public static void repeated_character_per_row_2(int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)('A'+i)+" ");
			}
			System.out.println();
		}
	}
	
	public static void right_aligned_triangle_3(int a)
	{
		// SOLUTION 1
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i+j>a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		// SOLUTION 2 (2&3 are seen from chatgpt)
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//SOLUTION 3
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j<a-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void pyramid_3(int a)
	{
		// MY SOLUTION
		int b=a;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				if((i+j) > a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			b++;
			System.out.println();
		}
		  
		// USING 3 FOR LOOPS
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// USING IF 
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=2*a-1;j++)
			{
				if(j>=a-i+1 && j<=a+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void inverted_pyramid_3(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=2*a-1; j++)
			{
				if(((i+j)<=2*a) && (i<=j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void continious_numbesr_4(int a)
	{
		int k=1;
		for(int i=1; i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i>=j)
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void number_pyramid_4(int a )
	{
		int k=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=2*a-1;j++)
			{
				if(j>=a-i+1 && j<=a+i-1)
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void alternative_number_4(int a)
	{
		int k=0;
		for(int i=1; i<=a; i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j<=i)
				{
					System.out.print(k);
					k = 1-k;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow_square_5(int a)
	{
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=a; j++)
			{
				if((i==1) || (j==1) || (i==a) || (j==a))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void x_pattern_5(int a)
	{
		for(int i=1; i<=a; i++)
		{
			for(int j=1;j<=a;j++)
			{
				if((i==j) || (i+j == a+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void diamond_pattern_5(int a)
	{
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=2*a-1; j++)
			{
				if((j>=a-i+1) && (j<=a+i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=2; i<=a;i++)
		{
			for(int j=1; j<=2*a-1;j++)
			{
				if(((i+j)<=2*a) && (i<=j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow_diamond_6(int a)
	{
		// MY LOGIC
		// upper half
		int k=0;
		for(int i=1; i<=a; i++)
		{
			for(int j=1;j<=a*2-1; j++)
			{
				if((i == 1)&&(i+j)==a+1)
				{
					System.out.print("*");
				}
				else if(((i>1) && (i+j)==a+k+1) || ((i+j)==a+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			k=k+2;
		}
	//lower half 	
		int y=2;
		for(int i=2; i<=a; i++)
		{
			for(int j=1;j<=2*a-1; j++)
			{
				if( ((i+j)==y+2) || ((i+j) == a+a))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			y+=2;
			System.out.println();
		}
		
		
		// CHATGPT LOGIC 
		// upper half
		for (int i = 1; i <= a; i++) {
		    for (int j = 1; j <= 2 * a - 1; j++) {
		        if (j == a - i + 1 || j == a + i - 1) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		//lower half
		for (int i = a - 1; i >= 1; i--) {
		    for (int j = 1; j <= 2 * a - 1; j++) {
		        if (j == a - i + 1 || j == a + i - 1) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
	}
}
