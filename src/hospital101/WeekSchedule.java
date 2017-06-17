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
public class WeekSchedule {
    private int[] Monday;
    private int[] Tuesday;
    private int[] Wednessday;
    private int[] Thursday;
    private int[] Friday;
    private int[] Saturday;
    private int[] Sunday;
    
    WeekSchedule(){
        Monday = null;
        Tuesday = null;
        Wednessday = null;
        Thursday = null;
        Friday = null;
        Saturday = null;
        Sunday = null;
    }

    public int[] getMonday() {
        return Monday;
    }

    public void setMonday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Monday = new int[4];
        this.Monday[0] = startHour;
        this.Monday[1] = startMinute;
        this.Monday[2] = endHour;
        this.Monday[3] = endMinute;
    }

    public int[] getTuesday() {
        return Tuesday;
    }

    public void setTuesday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Tuesday = new int[4];
        this.Tuesday[0] = startHour;
        this.Tuesday[1] = startMinute;
        this.Tuesday[2] = endHour;
        this.Tuesday[3] = endMinute;
    }

    public int[] getWednessday() {
        return Wednessday;
    }

    public void setWednessday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Wednessday = new int[4];
        this.Wednessday[0] = startHour;
        this.Wednessday[1] = startMinute;
        this.Wednessday[2] = endHour;
        this.Wednessday[3] = endMinute;
    }

    public int[] getThursday() {
        return Thursday;
    }

    public void setThursday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Thursday = new int[4];
        this.Thursday[0] = startHour;
        this.Thursday[1] = startMinute;
        this.Thursday[2] = endHour;
        this.Thursday[3] = endMinute;
    }

    public int[] getFriday() {
        return Friday;
    }

    public void setFriday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Friday = new int[4];
        this.Friday[0] = startHour;
        this.Friday[1] = startMinute;
        this.Friday[2] = endHour;
        this.Friday[3] = endMinute;
    }

    public int[] getSaturday() {
        return Saturday;
    }

    public void setSaturday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Saturday = new int[4];
        this.Saturday[0] = startHour;
        this.Saturday[1] = startMinute;
        this.Saturday[2] = endHour;
        this.Saturday[3] = endMinute;
    }

    public int[] getSunday() {
        return Sunday;
    }

    public void setSunday(int startHour, int startMinute, int endHour, int endMinute) {
        this.Sunday = new int[4];
        this.Sunday[0] = startHour;
        this.Sunday[1] = startMinute;
        this.Sunday[2] = endHour;
        this.Sunday[3] = endMinute;
    }
    
}
