import Calculation.Calculation;
import Calculation.Check;
import com.sun.javafx.css.Stylesheet;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) throws Exception {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(Graphic.Calculator.scene());
        stage.show();
    }
}
