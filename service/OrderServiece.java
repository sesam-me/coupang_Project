package service;

public class OrderServiece {
    private static OrderServiece service;
    public static OrderServiece getService() {
        if(service == null) service = new OrderServiece();
        return service;
    }
}
