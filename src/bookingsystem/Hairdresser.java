package bookingsystem;

public class Hairdresser {

    private String username;
    private String password;

    Hairdresser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean Validate(Hairdresser hairdresser){
        if(this.password.equals(hairdresser.getPassword()) && this.username.equals(hairdresser.getUsername())){
            return true;
        } else {
            return false;
        }
    }



}
