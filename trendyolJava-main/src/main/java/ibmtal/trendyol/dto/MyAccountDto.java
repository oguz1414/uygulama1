package ibmtal.trendyol.dto;

public class MyAccountDto{
	private int id;
	private String surname;
	private String age;
	private String gender;
	private String email;
	public MyAccountDto() {
		super();
	}
	public MyAccountDto(int id,String name,String surname,String email,String age,String gender) {
		super();
		this.id=id;
		this.surname=surname;
		this.email=email;
		this.age=age;
		this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getUsername() {
		return surname;
	}
	public void setUsername(String username, String surname) {
		this.surname=surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
}	
