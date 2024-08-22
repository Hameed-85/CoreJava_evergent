package com.evergent.corejava.arrays;

public class ArrayDemo2d6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		int c=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=c;
				c++;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		

	}

}
}
