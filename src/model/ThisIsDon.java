package model;

public class ThisIsDon {
	
	//my instance variables
	private String fname;
	private String lname;
	private double age;
	private String bio;
	
	//default no arg constructor
	public ThisIsDon() {
		super();
	}
	
	//faulty argy constructor ;)
	public ThisIsDon(String fname, String lname, String bio) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.bio = bio;
	}

	//getters and setters are not for bed wetters
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String name(String fname, String lname) {
		String name = this.fname + " " + this.lname;
		return name;
		
	}
}
