package com.coursecube.singleton;

public class LazySingleton {
	public static void main(String[] args) {
		Sing obj=Sing.getInstance();
		System.out.println(Sing.getInstance());
		System.out.println(Sing.getInstance());
		
	}

}

class Sing{
	private static Sing instance;
	
	private Sing() {}
	
	public static Sing getInstance() {
		if(instance==null) {
			instance=new Sing();
			
		}
		return instance;
	}
	
	
	
}