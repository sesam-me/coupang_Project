package repository;

public class BucketRepository {
    private static BucketRepository repository;
    public static BucketRepository getRepository() {
        if(repository == null) repository = new BucketRepository();
        return repository;
    }
}
