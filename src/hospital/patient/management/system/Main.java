/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital.patient.management.system;

import java.util.Scanner;
/**
 *
 * @author Sadana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("=================================================\n");
        System.out.print("       HOSPITAL PATIENT MANAGEMENT SYSTEM\n");
        System.out.print("=================================================\n\n");
        
        System.out.print("How many patients do you want to process?: ");
        Scanner scanner = new Scanner(System.in);
        int patientCount = scanner.nextInt();
        
        while (patientCount > 0) {

            Patient patient = new Patient(0, null, 0, null, 0);

            System.out.print("\nEnter new patient details: ");

            System.out.print("\nEnter patient ID: ");
            int patientID = scanner.nextInt();
            patient.setPatientID(patientID);

            System.out.print("Enter patient name: ");
            String patientName = scanner.next();
            patient.setPatientName(patientName);

            System.out.print("Enter patient age: ");
            int age = scanner.nextInt(); 
            patient.setAge(age);   

            System.out.print("Enter patient illness: ");
            String illness = scanner.next();
            patient.setIllness(illness);

            System.out.print("Enter patient bill amount (e.g. Rs.10,000.00 = 1000000): ");
            int billAmount = scanner.nextInt();
            patient.setBillAmount(billAmount);
            
            System.out.println("\nPatient Details:");
            System.out.println("Patient ID: " + patient.getPatientID());
            System.out.println("Patient Name: " + patient.getPatientName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Illness: " + patient.getIllness());
            System.out.println("Bill Amount: Rs." + (patient.getBillAmount())/100);
            System.out.println("Category: " + patient.determineCategory());
            System.out.println("Discounted Bill Amount: Rs." + (patient.calculateDiscount())/100);

            patientCount--;
        }
    }
    
}
