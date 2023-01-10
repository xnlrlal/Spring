package kr.co.redesigned;

import java.util.Date;
import java.util.Objects;

/*
  	id 			varchar(30) 	not null 	primary key
	, pwd 		varchar(50)
	, name 		varchar(30)
	, email 	varchar(30)
	, birth 	date
	, sns		varchar(30)
	, reg_date 	date
 */

public class User {

	private String id;
	private String pwd;
	private String name;
	private String eamil;
	private Date birth;
	private String sns;
	private Date reg_date;
	
	public User() {}
	public User(String id, String pwd, String name, String eamil, Date birth, String sns, Date reg_date) {
		// super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.eamil = eamil;
		this.birth = birth;
		this.sns = sns;
		this.reg_date = reg_date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birth, eamil, id, name, pwd, sns);
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
		return Objects.equals(birth, other.birth) && Objects.equals(eamil, other.eamil) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(pwd, other.pwd) && Objects.equals(sns, other.sns);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getSns() {
		return sns;
	}
	public void setSns(String sns) {
		this.sns = sns;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
