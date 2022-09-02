package pojo;

public class student {
	String name;
	String idc;
	String born;
	String phone;
	String birthday;
	String major;
	String beizhu;
	String id;
	public String getId() {
		return id;
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
	public String getIdc() {
		return idc;
	}
	public void setIdc(String idc) {
		this.idc = idc;
	}
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public student(String name,String idc,String born,String phone,String birthday,String major,String beizhu)
	{
		this.beizhu=beizhu;
		this.birthday=birthday;
		this.born=born;
		this.idc=idc;
		this.major=major;
		this.name=name;
		this.phone=phone;
	}
}
