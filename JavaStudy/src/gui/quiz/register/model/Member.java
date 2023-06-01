package gui.quiz.register.model;

import java.sql.Date;

public class Member {
	
	//private Integer mem_no;
	private String mem_id;
	private String password;
	private String mem_name;
	private String email;
	private String Phone_number;
	private Integer age;
	private Date birthday;
	private String gender;
	private String interst1;
	private String interst2;
	private String interst3;
	private Boolean sms;
	
	public Member() {}

	

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterst1() {
		return interst1;
	}

	public void setInterst1(String interst1) {
		this.interst1 = interst1;
	}

	public String getInterst2() {
		return interst2;
	}

	public void setInterst2(String interst2) {
		this.interst2 = interst2;
	}

	public String getInterst3() {
		return interst3;
	}

	public void setInterst3(String interst3) {
		this.interst3 = interst3;
	}

	public Boolean getSms() {
		return sms;
	}

	public void setSms(Boolean sms) {
		this.sms = sms;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	}

