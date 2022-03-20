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
//    private boolean isPatientHealthy;

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

//    public boolean isIsPatientHealthy() {
//        return isPatientHealthy;
//    }
//
//    public void setIsPatientHealthy(boolean isPatientHealthy) {
//        this.isPatientHealthy = isPatientHealthy;
//    }
    
    public Patient(String firstName, String lastName, int age, String gender, House homeAddress, String contactNumber, String email, VitalSigns vitalSign, int personId){
       super(firstName, lastName, age, gender, homeAddress, contactNumber, email, personId);
       this.vitalSign = vitalSign;
       this.patientId = personId + 101;
    }
    
    public boolean isHealthy(){
        boolean flag = true;
        String gender = getGender();
        int age = getAge();
        int lowBP = getVitalSign().getBpLow();
        int highBP = getVitalSign().getBpHigh();
        int heartRate = getVitalSign().getHeartRate();
        float weight = getVitalSign().getWeight();
        
        
     if(gender.equals("Male")){
            if(age>=1 && age<2){
                if(lowBP < 30 || lowBP > 65 || highBP < 45 || highBP > 90 ||heartRate < 100 || heartRate > 160 || weight < 1 || weight > 8){
                    flag = false;
                }
            
            } else if(age >= 2 && age <= 13){
                if(lowBP < 40 || lowBP > 80 || highBP < 80 || highBP > 120 ||heartRate < 60 || heartRate > 105|| weight < 8 || weight > 50 ){
                    flag = false;
                }
            
            }else if (age >= 14 && age <= 18){
                if(lowBP < 50 || lowBP > 80 || highBP < 90 || highBP > 120 ||heartRate < 60 || heartRate > 100 || weight < 30 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 19 && age <= 40){
                if(lowBP < 60 || lowBP > 80 || highBP < 95 || highBP > 135 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 41 && age <= 60){
                if(lowBP < 70 || lowBP > 90 || highBP < 110 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90 ){
                    flag = false;
                }
            
            }else if (age >= 61 ){
            if(lowBP < 70 || lowBP > 90 || highBP < 95 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            }
        
        } else if (getGender().equals("Female")){
            
            
            if(age>=1 && age<2){
                if(lowBP < 30 || lowBP > 65 || highBP < 45 || highBP > 90 ||heartRate < 100 || heartRate > 160 || weight < 1 || weight > 8){
                    flag = false;
                }
            
            } else if(age >= 2 && age <= 13){
                if(lowBP < 40 || lowBP > 80 || highBP < 80 || highBP > 120 ||heartRate < 60 || heartRate > 105|| weight < 8 || weight > 50 ){
                    flag = false;
                }
            
            }else if (age >= 14 && age <= 18){
                if(lowBP < 50 || lowBP > 80 || highBP < 90 || highBP > 120 ||heartRate < 60 || heartRate > 100 || weight < 30 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 19 && age <= 40){
                if(lowBP < 60 || lowBP > 80 || highBP < 95 || highBP > 135 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 41 && age <= 60){
                if(lowBP < 70 || lowBP > 90 || highBP < 110 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90 ){
                    flag = false;
                }
            
            }else if (age >= 61 ){
            if(lowBP < 70 || lowBP > 90 || highBP < 95 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            }
             
            
            } else{
             
            if(age>=1 && age<2){
                if(lowBP < 30 || lowBP > 65 || highBP < 45 || highBP > 90 ||heartRate < 100 || heartRate > 160 || weight < 1 || weight > 8){
                    flag = false;
                }
            
            } else if(age >= 2 && age <= 13){
                if(lowBP < 40 || lowBP > 80 || highBP < 80 || highBP > 120 ||heartRate < 60 || heartRate > 105|| weight < 8 || weight > 50 ){
                    flag = false;
                }
            
            }else if (age >= 14 && age <= 18){
                if(lowBP < 50 || lowBP > 80 || highBP < 90 || highBP > 120 ||heartRate < 60 || heartRate > 100 || weight < 30 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 19 && age <= 40){
                if(lowBP < 60 || lowBP > 80 || highBP < 95 || highBP > 135 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            
            }else if (age >= 41 && age <= 60){
                if(lowBP < 70 || lowBP > 90 || highBP < 110 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90 ){
                    flag = false;
                }
            
            }else if (age >= 61 ){
            if(lowBP < 70 || lowBP > 90 || highBP < 95 || highBP > 145 ||heartRate < 60 || heartRate > 100 || weight < 45 || weight > 90){
                    flag = false;
                }
            }
        }
        
    
    
    return flag;

    }
    

        
       


}