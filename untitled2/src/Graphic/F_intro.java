package Graphic;

import Storage.FunctionLine;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.LinkedList;


public class F_intro {
    static FunctionLine function;

    static Stage stage() {
        Stage stage = new Stage();
        if(Calculator.functions==null)
        {
           stage=Function.stage();

        }
        else {
        }


        return stage;
    }


}
