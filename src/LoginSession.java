import java.time.LocalTime;

public class LoginSession {
    private LocalTime loginTime;

    public LocalTime getLoginTime() { return loginTime; }
    public void setLoginTime(LocalTime loginTime) { this.loginTime = loginTime; }

    public boolean isLateLogin() {
        return false;
    }
}
