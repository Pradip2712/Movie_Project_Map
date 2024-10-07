package com.pdp.movie;

public class ActorInfo {
	
	private String name;
	private String gender;
	private int age;
	private String dob;
	private String mName;
	private int mYear;
	private String mType;
	
	
	public ActorInfo() {
		super();
	}


	public ActorInfo(String name, String gender, int age, String dob, String mName, int mYear, String mType) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.mName = mName;
		this.mYear = mYear;
		this.mType = mType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public int getmYear() {
		return mYear;
	}


	public void setmYear(int mYear) {
		this.mYear = mYear;
	}


	public String getmType() {
		return mType;
	}


	public void setmType(String mType) {
		this.mType = mType;
	}


	@Override
	public String toString() {
		return "ActorInfo [Actor_Name=" + name + ", gender=" + gender + ", age=" + age + ", DOB=" + dob + ", Moive_Name=" + mName
				+ ", Movie_Year=" + mYear + ", Movie_Type=" + mType + "]";
	}



	
	
	
	
	
	

}
