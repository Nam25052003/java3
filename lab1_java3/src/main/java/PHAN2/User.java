package PHAN2;

import java.io.Serializable;


public class User implements Serializable{
    public String usename;
    public String password;

    public User() {
    }

    public User(String usename, String password) {
        this.usename = usename;
        this.password = password;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
