package eCom.homeDecorBackEnd.models;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User")
public class User implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private String id;
private String name;
private String password;
private String role;
private String address;
private String email;
private String phone;

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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public User() {
	super();
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", address=" + address
			+ ", email=" + email + ", phone=" + phone + "]";
}


}

