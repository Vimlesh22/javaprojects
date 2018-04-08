/**
 * Purpose:Using Prototype design pattern for creating multiple employee object.
 * @author Vimlesh Kumar
 * @since 22 March 2018
 * 
 */
package com.bridgelabz.utility;
public class Employee implements Cloneable {

	String name;
	int age;
	long mobileNo;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Employee(String name, int age, long mobileNo) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	
	@Override
	public Object clone()
	{
		
		return new Employee(name,age,mobileNo);
	}
	
	
}
