package com.coursecube.singleton;

public class EnumSing {
 public static void main(String[] args) {
	 
	 SingEnum obj=SingEnum.Instance;
	 SingEnum.Instance.setValue(3);
	 System.out.println(SingEnum.values());
	 System.out.println(SingEnum.Instance.getValue());
	 
	 SingEnum.Instance.setValue(2);
	 System.out.println(SingEnum.Instance.getValue());
	 
	
}
}

 enum SingEnum{
	 
	 Instance;
	 
	 int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	 
	 
}
