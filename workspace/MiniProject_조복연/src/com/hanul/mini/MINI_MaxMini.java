package com.hanul.mini;

public class MINI_MaxMini {
	public static void main(String[] args) {
	     int[] arr= {1,2,3,-7,8};
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
	     System.out.println("최대값:" + max);
	     for(int i=0;i<=arr.length;i++) {
	    	 if(arr.length-1 == i) break;
	    	 if(arr[i] > arr[i+1]) {
	    		 min = arr[i+1];
	    	 }
	    	 else {
	    		 min = arr[i];
	    	 }
	     }
	     System.out.println("최소값:" + min);
		}
}
