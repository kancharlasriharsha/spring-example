package com.bean;

import java.io.Serializable;

public class User implements Serializable {
	private long userId;
	private String UserName;
	private String paswword;
	private String email;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPaswword() {
		return paswword;
	}
	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((paswword == null) ? 0 : paswword.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (UserName == null) {
			if (other.UserName != null)
				return false;
		} else if (!UserName.equals(other.UserName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (paswword == null) {
			if (other.paswword != null)
				return false;
		} else if (!paswword.equals(other.paswword))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	

}
