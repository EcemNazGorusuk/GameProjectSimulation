package Entities;

import java.sql.Date;

import Abstract.IEntity;

public class Gamer implements IEntity{
   private String id;
   private String firstName;
   private String lastName;
   private Date  dateOfBirth;
   private String tcNumber;
public Gamer(String id, String firstName, String lastName, Date dateOfBirth,String tcNumber) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.tcNumber = tcNumber;
	
}
public void oyuncuBilgileri() {
	System.out.println("Name: "+firstName+" Surname: "+lastName);
	
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getTcNumber() {
	return tcNumber;
}
public void setTcNumber(String tcNumber) {
	this.tcNumber = tcNumber;
}
 
   
}
