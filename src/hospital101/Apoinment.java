package hospital101;

import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Apoinment {
    private Date time;
    private int roomNumber;
    private double price;
    private int patientID;
    private int doctorID;
    
    Apoinment(String time,int roomNumber,double price, int patientID, int doctorID){
        this.setTime(time);
        this.setRoomNumber(roomNumber);
        this.setPrice(price);
        this.setPatientID(patientID);
        this.setDoctorID(doctorID);
    }

    public Date getTime() {
        return time;
    }

    public void setTime(String time) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.time = formatter.parse(time);
        } catch (ParseException ex) {
            Logger.getLogger(Apoinment.class.getName()).log(Level.SEVERE, null, ex);
        }
;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    
    public JPanel createAppoinmentJpanel(){
        JPanel panel = new JPanel(new FlowLayout());
        JButton play = new JButton("Play");
        JButton exit = new JButton("Exit");
        JLabel label = new JLabel();
        try {
            database = new DatabaseConnection("root","","jdbc:mysql://localhost/mydb");
            ResultSet patientDetails = database.statement.executeQuery("Select * from patient where patient_id = " + this.patientID);
            if(patientDetails.next()){
                System.out.println(patientDetails.getString("name"));
                label.setText("room No" + this.roomNumber + " | patient : " + patientDetails.getString("name") + " | time : " + this.getTime());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Apoinment.class.getName()).log(Level.SEVERE, null, ex);
        }

    
        panel.add(label);
        panel.add(play);
        panel.add(exit);

        return panel;
    }
}
