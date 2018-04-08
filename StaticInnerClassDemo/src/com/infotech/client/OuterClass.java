package com.infotech.client;

public class OuterClass {

	private static int outerData = 1000;
	private int nonStaticData =5000;

	static class InnerClass {
		private int innerData = 3000;
		public void invoke() {
			System.out.println("Static InnerClass:invoke method is Called:" + outerData);
			OuterClass.display();
			//System.out.println(nonStaticData);//can't access non static static member Outer class.
		}
	}

	public static void display() {
		System.out.println("OuterClass:display method is Called..");
		InnerClass innerClass = new InnerClass();
		System.out.println("Accessing innerClass Data::"+innerClass.innerData);
	}
}
