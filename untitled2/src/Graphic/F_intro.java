package Graphic;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class F_intro {

    static  Stage stage()
    {
        Stage stage=new Stage();
        TextField textField=new TextField("Enter number of Variable");
        Button enter =new Button("Enter");
        HBox box=new HBox();
        box.getChildren().addAll(textField,enter);
        Scene scene=new Scene(box);
        enter.setOnMouseClicked(event -> {
            String line=textField.getText();
            int number;
            try
            {
                number=Integer.parseInt(line);
                if(number>=5||number<=0)
                {
                    throw new Exception();
                }
            }
            catch (Exception e) {
                if (e instanceof RuntimeException) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("error");
                    alert.setHeaderText("please enter Integer");
                    alert.showAndWait();
                } else {
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("error");
                    alert.setHeaderText("your number show be more then 1 and less then 5");
                    alert.showAndWait();
                }
            }

        });

        return stage;
    }


}
