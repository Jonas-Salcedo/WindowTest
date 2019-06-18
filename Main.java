package WindowTest;
import javafx.application.*;
import javafx.stage.*;
public class Main extends Application{
    @Override
    public void start(Stage s)
    {
        s.setWidth(800);
        s.setHeight(600);
        s.show();
    }
    public static void main(String passes[])
    {
        launch(passes);
    }

}
