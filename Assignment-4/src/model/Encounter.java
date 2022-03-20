/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author arjun
 */
public class Encounter {
    private VitalSigns vitalSign;
    private LocalDateTime encounterTime;
    private int patientId;
    private boolean isPatientHealthy;
    
    public Encounter(VitalSigns vitalSign){
        this.vitalSign = vitalSign;
    
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public LocalDateTime getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(LocalDateTime encounterTime) {
        this.encounterTime = encounterTime;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isIsPatientHealthy() {
        return isPatientHealthy;
    }

    public void setIsPatientHealthy(boolean isPatientHealthy) {
        this.isPatientHealthy = isPatientHealthy;
    }
    
    
}
