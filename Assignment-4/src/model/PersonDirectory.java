/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arjun
 */
public class PersonDirectory {
    public ArrayList<Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person generateEmptyNewPerson(){
        House house = new House();
        Person person = new Person("","",0,"",house,"","",0);
        
        return person;
    }
    
    public boolean isUniquePersonId(int id){
        for (Person person: personList){
            if(person.getPersonId() == id){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isUniquePersonIdUpdate(int id, int selectedRowIndex){
        for (Person person: personList){
            if(person.getPersonId() == id && selectedRowIndex != personList.indexOf(person)){
                return false;
            }
        }
        
        return true;
    }
    
}
