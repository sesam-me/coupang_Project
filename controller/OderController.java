package controller;

public class OderController {
    private static OderController controller;

    public static OderController getController() {
        if(controller == null) controller = new OderController();
        return controller;
    }
}
