/**
 * Copyright (C) 2021 Mikhail Malakhov <malakhv@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.malakhv.leetcode.arrays;

/**
 * Class contains application's entry point.
 * @author Mikhail.Malakhov
 * */
public final class App {
	
	/** The name of this app. */
	private static final String APP_NAME = "Arrays";
	
	/** The version of this app. */
	private static final String APP_VERSION = "0.1.0";
	
	/**
	 * The App's entry point.
	 * */
	public static void main(String[] args) {
		printAppInfo();
		print(" ");
		int[] array;
		
		/*
		 * MaxConsecutiveOnes
		 */
		print("=====Test 1. Max Consecutive Ones=====");
		// Case 0. In [0], out 0
		array = new int[] {0};
		testMaxConsecutiveOnes(array);
		// Case 1. In [1], out 1
		array = new int[] {1};
		testMaxConsecutiveOnes(array);
		// Case 2. In [0,1], out 1
		array = new int[] {0,1};
		testMaxConsecutiveOnes(array);
		// Case 3. In [0,1,0], out 1
		array = new int[] {0,1,0};
		testMaxConsecutiveOnes(array);
		// Case 4. In [1,1,0,1,1,1], out 3
		array = new int[] {1,1,0,1,1,1};
		testMaxConsecutiveOnes(array);
		// Case 5. In [0,1,0,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1], out 7
		array = new int[] {0,1,0,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1};
		testMaxConsecutiveOnes(array);
		print(" ");
		
		/*
		 * Find Numbers with Even Number of Digits 
		 */
		print("=====Test 2. Even Number of Digits=====");
		// Case 0. In [0], out 0
		array = new int[] {0};
		testEvenNumberOfDigits(array);
		
		// Case 1. In [11], out 1
		array = new int[] {11};
		testEvenNumberOfDigits(array);
		// Case 2. In [0,11], out 1
		array = new int[] {0,11};
		testEvenNumberOfDigits(array);
		// Case 3. In [12,345,2,6,7896], out 1
		array = new int[] {12,345,2,6,7896};
		testEvenNumberOfDigits(array);
		// Case 4. In [1,23,456,7890,12345,678901,2345678], out 3
		array = new int[] {1,23,456,7890,12345,678901,2345678};
		testEvenNumberOfDigits(array);
		
	}
	
	/**
	 * Given a binary array, find the maximum number of consecutive 1s in this array.
	 * */
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = count > max ? count : max;
                count = 0;
            }
        }
        return count > max ? count: max;
    }
	
	private static void testMaxConsecutiveOnes(int[] array) {
		print("The Max Consecutive Ones for " + Utils.arrayToString(array) + " is "
				+ findMaxConsecutiveOnes(array));
	}
	
	/**
	 * Given an array {@code nums} of integers, return how many of them contain an even
	 * number of digits.
	 * */
	public static int findEvenNumberOfDigits(int[] array) {
        int count = 0;
		int digits = 1;
		for (int val: array) {	
			while((val = val / 10) > 0) {
				digits++;
			}
			if (digits % 2 == 0) count++;
			digits = 1;
		}
		return count;   
    }
	
	private static void testEvenNumberOfDigits(int[] array) {
		print("The number of values with even number of digits for "
				+  Utils.arrayToString(array) + " is " + findEvenNumberOfDigits(array));
		
	}
	
	/**
	 * Prints information about this App.
	 * */
	private static void printAppInfo() {
		System.out.print("Program: ");
		System.out.print(APP_NAME);
		System.out.print(" (");
		System.out.print(APP_VERSION);
		System.out.println(")");
	}
	
	private static void print(String... strings) {
		if (strings == null || strings.length <= 0) {
			System.out.println("NULL");
		}
		for (String str: strings) {
			if (!Utils.isEmpty(str)) System.out.println(str);
			else System.out.println("NULL");
		}
	}
	
}
// END