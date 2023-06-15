package veiw;

public class CommonView {
    private static CommonView view;
    public static CommonView getView() {
        if (view == null) {
            view = new CommonView();
        }
        return view;
    }
}
