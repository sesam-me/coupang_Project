package service;

public class ProductServiece {
    private static ProductServiece service;
    public static ProductServiece getService() {
        if(service == null) service = new ProductServiece();
        return service;
    }
}
