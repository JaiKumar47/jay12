package com.coursecube.singleton;

public class EagerSingleton {

	public static void main(String[] args) {
		Singleton obj=Singleton.getInstance();
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		
		
System.out.println("done");
System.out.println("done");
	}

}

class Singleton{
	private static final Singleton obj=new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		return obj;
	}
	
	
}
