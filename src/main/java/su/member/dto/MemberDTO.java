package su.member.dto;

public class MemberDTO {
	private String name;
	 private String id;
	 private int age;
	 private String birthday;
	 private String password;
	 private String gender;
	 private String hobby;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", id=" + id + ", age=" + age + ", birthday=" + birthday + ", password="
				+ password + ", gender=" + gender + ", hobby=" + hobby + "]";
	}
	 
}
