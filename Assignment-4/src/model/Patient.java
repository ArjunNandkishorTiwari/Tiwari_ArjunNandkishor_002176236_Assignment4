/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arjun
 */
public class Patient extends Person {
    private VitalSigns vitalSign;
    private int patientId;

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public Patient(String firstName, String lastName, int age, String gender, House homeAddress, String contactNumber, String email, VitalSigns vitalSign, int personId){
       super(firstName, lastName, age, gender, homeAddress, contactNumber, email, personId);
       this.vitalSign = vitalSign;
       this.patientId = personId + 101;
    }
    
    
}
