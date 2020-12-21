package com.coursecube.singleton;

public class staticblock {
	public static void main(String[] args) {
		
	
	Singleton1 obj=Singleton1.getInstance();
	
	System.out.println(Singleton1.getInstance());
	System.out.println(Singleton1.getInstance());
	

}
}

 class Singleton1{
	
	private static Singleton1 instance;
	static {
		instance=new Singleton1();
	}
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		
		return instance;
		
	}
	
	
	
}