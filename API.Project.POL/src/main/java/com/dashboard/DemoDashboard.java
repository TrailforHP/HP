package com.dashboard;

public class DemoDashboard {
	
	public static int DemoDashboard(int x) {
		return x;
	}
	
	public void demo1() {

		System.out.println("Demo1 method is executed");
	}
	public void demo2() {
		
		System.out.println("Demo2 method is executed");

	}

	public static void main(String[] args) {

		DemoDashboard dashboard=new DemoDashboard();

		dashboard.demo1();
		dashboard.demo2();
		
		//DemoDashboard(10);
		System.out.println(DemoDashboard(10));

	}



}
