package PHAN2;

public class User {
    private String userName;
    private String pwdPassWord;

    public User() {
    }

    public User(String userName, String pwdPassWord) {
        this.userName = userName;
        this.pwdPassWord = pwdPassWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwdPassWord() {
        return pwdPassWord;
    }

    public void setPwdPassWord(String pwdPassWord) {
        this.pwdPassWord = pwdPassWord;
    }

    
    
}
