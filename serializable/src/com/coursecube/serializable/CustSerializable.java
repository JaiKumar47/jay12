package com.coursecube.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustSerializable {

	public static void main(String[] args) throws Exception {
		Account1 a1=new Account1();
		System.out.println(a1.un+"\t"+a1.pwd);
	
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account1 a2=(Account1)ois.readObject();
        System.out.println(a2.un+"\t"+a2.pwd);
        
        System.out.println("Every thing is fine");
        System.out.println("hellooooooooooo");
        System.out.println("hellooooooooooo");
        System.out.println("hellooooooooooo");

	}
}
	
	
	class Account1 implements Serializable{
		String un="jay123";
	   transient String pwd="jay";
	 private void writeObject(ObjectOutputStream os) throws Exception {
		 os.defaultWriteObject();
		 String epwd="123"+pwd;
		 os.writeObject(epwd);
		 
	 }
	 
	 private void readObject(ObjectInputStream is) throws Exception {
		 is.defaultReadObject();
		 String epwd=(String)is.readObject();
		 pwd=epwd.substring(3);
	 }
		
		
	}
	


