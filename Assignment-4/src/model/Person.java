/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arjun
 */
public class Person {
    private String firstName;
    private String lastName;
    int personId;
    private int age;
    private String gender;
    private String contactNumber;
    private String email;
    private House homeAddress;
//     

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

//    public long getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(long contactNumber) {
//        this.contactNumber = contactNumber;
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

//    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Person(String firstName, String lastName, int age, String gender, House homeAddress, String contactNumber, String email, int personId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.personId = personId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(House homeAddress) {
        this.homeAddress = homeAddress;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
