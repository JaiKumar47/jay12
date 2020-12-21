package com.coursecube.singleton;

public class DoubleCheck {

	public static void main(String[] args) {
		Singleton2 obj=Singleton2.getInstance();
		System.out.println(Singleton2.getInstance());
		System.out.println(Singleton2.getInstance());

	}

}

class Singleton2{
	
	private static Singleton2 instance;
	private Singleton2() {}
	public static Singleton2 getInstance() {
		if(instance==null) {
			synchronized (Singleton2.class) {
				if(instance==null) {
					instance=new Singleton2();
				}
				
			}
			
}
		return instance;
	}
	
}