package com.zxt.po;

public class User {
	private int uid;
	private String uname;
	private int upassword;
	private int umoney;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUpassword() {
		return upassword;
	}
	public void setUpassword(int upassword) {
		this.upassword = upassword;
	}
	public int getUmoney() {
		return umoney;
	}
	public void setUmoney(int umoney) {
		this.umoney = umoney;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword="
				+ upassword + ", umoney=" + umoney + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + uid;
		result = prime * result + umoney;
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + upassword;
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
		if (uid != other.uid)
			return false;
		if (umoney != other.umoney)
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (upassword != other.upassword)
			return false;
		return true;
	}
	public User(int uid, String uname, int upassword, int umoney) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.umoney = umoney;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
