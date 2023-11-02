package com.examples;



public class Example9 {

	public static void main(String[] args) {
		int[] a= {1,7,-1,0,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[i]) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		

}
}
