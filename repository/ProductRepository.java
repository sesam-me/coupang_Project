package repository;

public class ProductRepository {
    private static ProductRepository repository;
    public static ProductRepository getRepository() {
        if(repository == null) repository = new ProductRepository();
        return repository;
    }
}
