package com.evergent.corejava.arrays;

public class ArrayDemo2d4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 || i==4 ||j==0 || j==4) {
					arr[i][j]=7;
				}
				else {
					arr[i][j]=0;
				}
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
