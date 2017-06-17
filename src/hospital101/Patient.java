package hospital101;

public class Patient {
    private String name;
    private String address;
    private String number;
    private int patientID;
    private boolean isAdmitted;
    private int gardianID;
    private int wardID;
    private int leadDoctorID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }

    public int getGardianID() {
        return gardianID;
    }

    public void setGardianID(int gardianID) {
        this.gardianID = gardianID;
    }

    public int getWardID() {
        return wardID;
    }

    public void setWardID(int wardID) {
        this.wardID = wardID;
    }

    public int getLeadDoctorID() {
        return leadDoctorID;
    }

    public void setLeadDoctorID(int leadDoctorID) {
        this.leadDoctorID = leadDoctorID;
    }
}
