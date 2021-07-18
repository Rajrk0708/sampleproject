package com.raj.testing;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {
	
	//  1. Odd/Even number:- check the given number is odd or even.
	public static void odd_or_even(int num) {
			if (num%2==1) {
				System.out.println("1. Number "+num+" is a Odd number");
			} else {
				System.out.println("1. Number "+num+" is a Even number");
			}
	}
	
	//  2. Odd numbers:- To get and print Odd numbers only.
	public static void oddNum(int from, int to) {
		System.out.print("2. Odd Numbers "+from+" to "+to+": ");
		for (int i = from; i <= to; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
	}
	
	//  3. Even numbers:- To get and print Even numbers only.
	public static void evenNum(int from, int to) {
		System.out.print("3. Even Numbers from 1 to 10: ");
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
	}
	
	//  4. Count of numbers (Ex. Even numbers in 1 to 10 is 5).
	public static void countEven() {
		int counteven = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				counteven = counteven++;
			} 
		}
		System.out.println("4. Count Even Numbers from 1 to 10 is: "+counteven);
	}
	
	//  5. Count of numbers (Ex. Odd numbers in 1 to 10 is 5).
	public static void countOdd() {
		int countodd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==1) {
				countodd = countodd+1;
			}
		}
		System.out.println("5. Count Odd Numbers from 1 to 10 is: "+countodd);
	}
	
	//  6. Sum is a adding of numbers (Ex. sum of 5 is 15) 1+2+3+4+5 = 15.
	public static void sum(int sumnum) {
		int sum = 0;
		for (int i = 0; i <= sumnum; i++) {
			sum = sum+i;
		}
		System.out.println("6. Sum of "+sumnum+" is: "+sum);
	}
	
	//  7. Factorial number is the product of all the numbers from 1 to that number. Also fact of 0 is 1.
	//		(Ex. fact of 5 is 1*2*3*4*5 = 120).
	public static void factorial(int factnum) {
		int factorial = 1;
		for (int i = 1; i <= factnum; i++) {
			factorial = factorial*i;
		}
		System.out.println("7. Factorial of "+factnum+" is: "+factorial);
	}
	
	//  8. Sum is a adding of Even numbers.
	public static void evenSum(int from, int to) {
		int evensum = 0;
		for (int i = from; i <= to; i++) {
			if (i%2==0) {
				evensum = evensum+i;
			}
		}
		System.out.println("8. Sum of Even Numbers: "+evensum);
	}
	
	//  9. Sum is a adding of odd numbers.
	public static void oddSum(int from, int to) {
		int oddsum = 0;
		for (int i = from; i <= to; i++) {
			if (i%2==1) {
				oddsum = oddsum+i;
			}
		}
		System.out.println("9. Sum of Odd Numbers: "+oddsum);
	}
	
	// 9.b. Additional program sum if the data's in Array 
			public static void sumArray() {
				int a[] = {10,20,30,40,50};
				int sum = 0;
				for (int i = 0; i < a.length; i++) {		
					sum= sum+a[i];
				}
				System.out.println(sum);	
				}	
	
	//  10. Reverse the Integer.
	public static void returnInteger() {
		int num = 123;
		int rem = 0;
			while (num>0) {
			rem = (rem*10)+num%10;
			num = num/10;
			}
			System.out.print("10. Reverse the Integer 123: "+rem);
	}
	
	//  11. Palindrome number or not.
	//A palindromic number is a number (such as 16461) that remains the same when its digits are reversed.
	public static void palindromeNumber_or_not() {
		int num = 141, num1 = 0;
		int rem = 0;
		num1 = num;
		while (num > 0) {
			rem = (rem * 10) + num % 10;
			num = num / 10;
		}
		if (num1==rem) {
			System.out.println("11. 141 is a palindrome number");
		} else {
			System.out.println("11. 141 is Not a palindrome number");
		}
	}
	
	//  12. Palindrome number from 1 to 100.
	public static void palindromeNumbers() {
		System.out.print("12. Palindrome Numbers 1 to 100: ");
		for (int i = 1; i <= 100; i++) {
			int num = i;
			int num1 = 0;
			int rem = 0;
			num1 = num;
			while (num > 0) {
				rem = (rem * 10) + num % 10;
				num = num / 10;
			}
			if (num1==rem) {
				System.out.print(rem+" ");
			} 
		}	
	}
	
	// 13. Armstrong
	//  An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
	//	Ex. 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	public static void armstrong() {
		int num = 153, num1 = 0;
		int n2 = 0, rem = 0;
		num1 = num;
		while (num > 0) {
			n2 = num % 10;
			rem = rem + (n2*n2*n2);
			num = num / 10;
		}
		if (num1 == rem) {
			System.out.println("13. Armstrong");
		} else {
			System.out.println("13. Not a Armstrong Number");
		}
	}
	
	//  14. Armstrong numbers from 1 to 600.
	public static void armstrongNumbers() {
		for (int i = 1; i <= 600; i++) {
			int num = i, num1 = 0;
			int n2 = 0, rem = 0;
			num1 = num;
			while (num > 0) {
				n2 = num % 10;
				rem = rem + (n2*n2*n2);
				num = num / 10;
			}
			if (num1 == rem) {
				System.out.println(rem);
			}
		}
	}
	
	// 15. Count the Digits of the number.
	public static void countDigits() {
		int num = 12567893, count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
	
	// 16. Sum of the digit.
	public static void sumDigits() {
		int num = 1238, rem = 0;
		int num1 = 0;
		while (num > 0) {
			num1 = num % 10;
			rem = rem + num1;
			num = num / 10;
		}
		System.out.println(rem);
	}
	
	// 17. Swape the 2 number with using 3rd variable name.
	public static void swapVariables() {
		int a = 10, b = 20, temp;
		temp = a;//temp=10
		a = b;//a=20
		b = temp;//b=10
		System.out.println(a);
		System.out.println(b);
	}
		
	// 18. Swape the 2 number without using 3rd variable name.
	public static void swapVariablesWithoutAnotherVar() {
		int a = 10, b = 20;
		a= a+b;//a= 30
		b= a-b;//b=10
		a= a-b;//a=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
			
	}
		
	// 19. Fibanocii Series from 1 to 10.
	public static void fibanocciSeries() {
			int a = 0, b = 1;
			int c = 0;
			for (int i = 1; i <=10 ; i++) {
				c= a+b;
				System.out.println(c);
				a=b;
				b=c;
			}	
	}
	
	// 20. Fibanocii Series Sum from 1 to 10.
		public static void fibanocciSeriesSum() {
				int a = 0, b = 1;
				int c = 0; 
				int sum = 0;
				for (int i = 1; i <=10 ; i++) {
					c= a+b;
					sum=sum+c;
					a=b;
					b=c;
				}	
				System.out.println(sum);
		}
		
	// 21. Reverse the string
	public static void reversetheString() {
			String rj = "shalu";
			String rk = "";
			for (int i = rj.length()-1 ; i >= 0; i--) {
				char ch = rj.charAt(i);
				rk=rk+ch;
			}
			System.out.println(rk);
	}
	
	// 21. Split the string
		public static void splitTheString() {
				String rj = "shalu jack oru loosu raj deeps";
				String[] split = rj.split(" ");
				for (String string : split) {
					System.out.println(string);
				}		
		}
		
	// 22. Palindrome String or not:
		public static void palindromeString() {
			String name = "madam";
			String res = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				char ch = name.charAt(i);
				res = res + ch;
			}
			if (res.equals(name)) {
				System.out.println("Palindrome string");
			} else {
				System.out.println("Not palindrome string");
			}
		}
		
	// 23. Asc order
		public static void ascOrder() {
			int a[] = { 10, 100, 90, 20, 40 }, temp;

			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	// 23.1 Asending array value less second value	
		public static void ascLessOrder() {
			int a[] = { 10, 100, 90, 20, 40 }, temp;
			int b[] = new int [a.length-1];
			for(int i=0;i<a.length-1;i++) {
				b[i]=a[i]-a[i+1];
				System.out.println(b[i]);
			}
			for (int i = 0; i < b.length; i++) {
				for (int j = i + 1; j < b.length; j++) {
					if (b[i] > b[j]) {
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]+"after");
			}
		}
		
	// 23.2 Asending array value less second value and find minmum and maximum number
		public static void ascLessOrderMax_and_Min() {
			int a[] = { 10, 100, 90, 20, 40 }, temp;
			int b[] = new int [a.length-1];
			for(int i=0;i<a.length-1;i++) {
				b[i]=a[i]-a[i+1];
				System.out.println(b[i]);
			}
			for (int i = 0; i < b.length; i++) {
				for (int j = i + 1; j < b.length; j++) {
					if (b[i] > b[j]) {
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]+"after");
			}
			System.out.println("Min no:" + b[0]);
			System.out.println("Max no:" + b[b.length - 1]);
		}
		
	// 24. Dec order
				public static void decOrder() {
					int a[] = { 10, 100, 90, 20, 40 }, temp;

					for (int i = 0; i < a.length; i++) {
						for (int j = i + 1; j < a.length; j++) {
							if (a[i] < a[j]) {
								temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}
					}

					for (int i = 0; i < a.length; i++) {
						System.out.println(a[i]);
					}
				}
				
	// 25. Max and Min number in given array:
				public static void min_and_max() {
					int a[] = { 10, 100, 90, 20, 40 }, temp;

					for (int i = 0; i < a.length; i++) {
						for (int j = i + 1; j < a.length; j++) {
							if (a[i] < a[j]) {
								temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}
					}

					for (int i = 0; i < a.length; i++) {
						System.out.println(a[i]);
					}

					System.out.println("Max no:" + a[0]);
					System.out.println("min no:" + a[a.length - 1]);
				}
				
	// 26. Vowels count:
	public static void vowelsCount() {
		String name = "Welcome";
		int vowelsCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				vowelsCount++;
			}
			
		}
		System.out.println(vowelsCount);
	}
	
	// 27. Consonants and vowels count:
		public static void vowels_Consonants_Count() {
			String name = "Welcome";
			int vowelsCount = 0;
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {

					vowelsCount++;
				}
				
			}
			System.out.println(vowelsCount);
		}
	
	// 28. print the vowels and consonants seperately:
		public static void vowels_Consonants_Seperately() {
			String name = "Welcome";
			String vowels = "";
			String consonant = "";
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {

					vowels = vowels +ch;
				} else {
					consonant=consonant+ch;
				}

			}
			System.out.println(vowels);
			System.out.println(consonant);		
		}
		
	// 29.Count of each character in given String:
	public static void counteachcharinString() {
		String name = "Welcome";
		Map<Character, Integer> emp = new LinkedHashMap<>();
		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (emp.containsKey(c)) {
				int count = emp.get(c);
				emp.put(c, count + 1);
			} else {
				emp.put(c, 1);

			}

		}
		System.out.println(emp);
	}
	
	// 30.Count of word character in given String:
	public static void counteachWord() {
		String name = "Welcome to java sql java to java sql plsql";
		Map<String, Integer> mp = new LinkedHashMap<>();
		String[] split = name.split(" ");
		for (String c : split) {
			if (mp.containsKey(c)) {
				int count = mp.get(c);
				mp.put(c, count+1);
			} else {
				mp.put(c, 1);
			}
			
		}
		System.out.println(mp);
	}
	
	// 31.Print the word count in given string:
	public static void wordCount() {
		String name = "Welcome to java sql java to java sql plsql";
		String[] split = name.split(" ");
		System.out.println(split.length);
	}
	
	// 32.Convert string into init cap:
	public static void firstcharCap() {
		String name = "Welcome to java sql java to java sql plsql";
		String[] x = name.split(" ");
		String res = "";
		for (String v : x) {
			String first = v.substring(0, 1);
			String after = v.substring(1);
			res = res + first.toUpperCase() + after + " ";

		}
		System.out.println(res.trim());
	}
	
	// 33.Print the count of caps,small,digit and sc count:
	public static void countcharidentity() {
		String name = "Welcome@123456";
		int lcount = 0, dcount = 0, ucount = 0 , spcount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
				if (Character.isUpperCase(ch)) {
					ucount++;
				} if (Character.isLowerCase(ch)) {
						lcount++;
					  } if (Character.isDigit(ch)) {
							dcount++;
						} if (!Character.isAlphabetic(ch)&&!Character.isDigit(ch)) {
								spcount++;
						  }
		}
		System.out.println("Lowercase: "+lcount);
		System.out.println("Uppercase: "+ucount);
		System.out.println("Digit: "+dcount);
		System.out.println("Special Character: "+spcount);
	}
	
	// 34.Convert all Small case into caps and reverse:
	public static void reverseCharSensitive() {
		String name = "WelcomE";
		StringBuffer sb = new StringBuffer(name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.setCharAt(i, Character.toLowerCase(ch));
			} if (Character.isLowerCase(ch)) {
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		String string = sb.toString();
		System.out.println(string);
	}
	
	// 35.Prime or not:
	public static void primeOrNot() {
		int n = 10;
		int count= 0;
		for (int j = 2; j <= n/2; j++) {
			if (n%j==0) {
				count=1;
				break;
			}
		} if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
	
	// 36.Prime from 1 to 100:
		public static void primenumsto100() {
			for (int i = 1; i <=100; i++) {
				int count= 0;
				for (int j = 2; j <= i/2; j++) {
					if (i%j==0) {
						count=1;
						break;
					}
				} if (count == 0) {
					System.out.println(i);
				} 
			}
		}
		
	// 36.Prime numbers count from 1 to 500:
		public static void primenumsCount() {
					int count = 0;
					for (int i = 1; i <=500; i++) {
						int a= 0;
						for (int j = 2; j <= i/2; j++) {
							if (i%j==0) {
								a=1;
								break;
							}
						} if (a == 0) {
							count++;
						} 
					}
					System.out.println(count);
					
		}
	
public static void main(String[] args) {
	primenumsCount();
		
	}
}
	
