package com.hanul.jdbc;

public class es {

	public static void main(String[] args) {
     int[] arr= {1,2,3,-7,8,9};
     int max=0,min=0;
     for(int i=0;i<=arr.length;i++) {
    	 if(arr.length-1 == i) break;
    	 if(arr[i] > arr[i+1]) {
    		 max = arr[i];
    	 }
    	 else {
    		 max = arr[i+1];
    	 }
     }
     System.out.println(max);
     for(int i=0;i<=arr.length;i++) {
    	 if(arr.length-1 == i) break;
    	 if(arr[i] > arr[i+1]) {
    		 min = arr[i+1];
    	 }
    	 else {
    		 min = arr[i];
    	 }
     }
     System.out.println(min);
	}

}
