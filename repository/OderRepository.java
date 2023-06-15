package repository;

public class OderRepository {
    private static OderRepository repository;
    public static OderRepository getRepository() {
        if(repository == null) repository = new OderRepository();
        return repository;
    }

}
