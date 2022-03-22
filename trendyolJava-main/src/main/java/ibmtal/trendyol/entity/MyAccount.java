package ibmtal.trendyol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;








@Entity
@Table(name="MyAccounts")
public class MyAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private String age;
	@Column(name="gender")
	private String gender;
	public MyAccount() {
		super();
	}
	public MyAccount(int id,String username,String email,String age,String gender) {
		super();
		this.id=id;
		this.username=username;
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
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
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
