package service;

public class BucketServiece {
    private static BucketServiece service;
    public static BucketServiece getService() {
        if(service == null) service = new BucketServiece();
        return service;
    }
}
