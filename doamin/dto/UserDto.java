package doamin.dto;

public class UserDto {
    private int user_Seq;
    private String user_name;
    private String user_password;
    private String user_email;

    public UserDto(int user_Seq, String user_name, String user_password, String user_email) {
        this.user_Seq = user_Seq;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
    }

    public int getUser_Seq() {
        return user_Seq;
    }

    public void setUser_Seq(int user_Seq) {
        this.user_Seq = user_Seq;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
