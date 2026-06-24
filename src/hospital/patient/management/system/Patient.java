package hospital.patient.management.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sadana
 */
public class Patient {
    private int patientID;
    private String patientName;
    private int age;
    private String illness;
    private int billAmount; // divide by 100 when displaying to avoid floating point errors

    public Patient(int patientID, String patientName, int age, String illness, int billAmount) {
        this.patientID = 0;
        this.patientName = "";
        this.age = 0;
        this.illness = "";
        this.billAmount = 0;
    }

    // getters and setters
    public int getPatientID() {
        return patientID;
    }
    public String getPatientName() {
        return patientName;
    }
    public int getAge() {
        return age;
    }
    public String getIllness() {
        return illness;
    }
    public int getBillAmount() {
        return billAmount;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    //determine if patient is eligible for discount
    public String determineCategory(){
        
        if(this.age < 13){
            return "Child";
        } else if(13 <= this.age && this.age <= 59){
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }

    //discount
    public int calculateDiscount(){

        int discountedBillAmount;

        if(this.billAmount > 5000000){
            discountedBillAmount = (int) (this.billAmount * 0.90);
        } else if(this.billAmount >= 2500000){
            discountedBillAmount = (int) (this.billAmount * 0.95);
        } else {
            discountedBillAmount = this.billAmount;
        }

        return discountedBillAmount;
    }
}

