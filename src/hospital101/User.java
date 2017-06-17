package hospital101;

public abstract class User {
    private String userName;
    private String passwordHash;
    
    User(String userName, String passwordHash){
        this.setUserName(userName);
        this.setPasswordHash(passwordHash);
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
