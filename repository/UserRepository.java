package repository;

public class UserRepository {
    private static UserRepository repository;
    public static UserRepository getRepository() {
        if(repository == null) repository = new UserRepository();
        return repository;
    }

}
