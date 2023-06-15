package service;

public class UserServiece {
    private static UserServiece service;
    public static UserServiece getService() {
        if(service == null) service = new UserServiece();
        return service;
    }
}
