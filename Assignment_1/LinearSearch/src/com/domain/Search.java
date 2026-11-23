package com.domain;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
	public static int linearS(int key,int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {20,55,33,11,4,55,42,90,4,33};
		int idx;
		Scanner sc = new Scanner(System.in);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Enter Num");
	
		int key=sc.nextInt();
		System.out.println(( idx=linearS(key, arr))==-1?"Key not Found":"Key found at index: "+idx);

	}

}
