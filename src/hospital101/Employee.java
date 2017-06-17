/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital101;

/**
 *
 * @author pasindu
 */
public class Employee extends User{
    private int employeeId;
    private String phoneNumber;
    private String address;
    private double salary;
    private double overtimeSalary;
    private boolean isSalaryPaidHourly;
    private String specialty;
    private String type;
    
    Employee(String userName,String passwordHash, int employeeId){
        super(userName,passwordHash);
        this.employeeId = employeeId;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOvertimeSalary() {
        return overtimeSalary;
    }

    public void setOvertimeSalary(double overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public boolean isIsSalaryPaidHourly() {
        return isSalaryPaidHourly;
    }

    public void setIsSalaryPaidHourly(boolean isSalaryPaidHourly) {
        this.isSalaryPaidHourly = isSalaryPaidHourly;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
