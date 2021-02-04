package com.me.DTO;

public class MemberDTO {
	//Data Transfer Object
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String regiDate;
	private String updateDate;
	
	@Override
	public String toString() {
		return "MemberDTO  [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth
				+ ", email=" + email + ", regiDate=" + regiDate + ", updateDate=" + updateDate + "]";
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}

