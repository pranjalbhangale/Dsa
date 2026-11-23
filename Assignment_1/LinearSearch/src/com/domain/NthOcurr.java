package com.domain;

import java.util.Arrays;
import java.util.Scanner;

public class NthOcurr {
	public static int linearNthS(int key,int[] arr,int n) {
		int idx,cnt=0;
		if(n>=arr.length) return -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				idx=i;
				cnt++;
				if(cnt==n) {
					return idx;}
			
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr= {20,55,33,11,4,55,42,90,4,33,33};
		int idx;
		Scanner sc = new Scanner(System.in);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Enter Num");
	
		int key=sc.nextInt();
		System.out.println("Enter nth Ocurrence");
		
		int nth=sc.nextInt();
		System.out.println(( idx=linearNthS(key, arr,nth))==-1?"Key not Found":"Key found at index: "+idx);


	}

}
