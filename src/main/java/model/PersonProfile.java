package model;

import java.io.Serializable;

public class PersonProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -675063802189285083L;

	private int personId;
	
	private String name;
	
	private String birth;
	
	private String gender;
	
	private String address;
	
	private String postCode;
	
	private String email;
	
	private String tel;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("代號:"+this.getPersonId()+"\n");
		sb.append("姓名:"+this.getName()+"\n");
		sb.append("性別:"+this.getGender()+"\n");
		sb.append("生日:"+this.getBirth()+"\n");
		sb.append("郵政區號:"+this.getPostCode()+"\n");
		sb.append("地址:"+this.getAddress()+"\n");
		sb.append("電話:"+this.getTel()+"\n");
		sb.append("EMAIL:"+this.getEmail()+"\n");
	
		return sb.toString();
	}
	
	
	
}
