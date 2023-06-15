package controller;

public class UserController {
    private static UserController controller;

    public static UserController getController() {
        if(controller == null) controller = new UserController();
        return controller;
    }
}
