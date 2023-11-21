package Graphic;

import Storage.FunctionLine;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Function {
    static StringBuilder line=new StringBuilder();
    static Button text=new Button(line.toString());
    static StringBuilder added=new StringBuilder();
    static int functionNumber=0;
    static void Add(String a)
    {
        if(!added.toString().contains(a))
        {
            functionNumber++;
            added.append(a);
        }
    }
    public static Stage stage()
    {
        Stage stage=new Stage();
        VBox vBox=new VBox();
        vBox.getChildren().add(text);
        GridPane numbers=new GridPane();
        vBox.getChildren().add(numbers);
        text.setPrefWidth(75);
        Button remove=new Button("C");
        Button back=new Button("<=");
        Button BL=new Button("(");
        Button BR=new Button(")");
        Button factorial=new Button("!");
        Button N1=new Button("A");
        Button N2=new Button("B");
        Button N3=new Button("C");
        Button N4=new Button("D");
        Button N5=new Button("E");
        Button N6=new Button("F");
        Button N7=new Button("G");
        Button N8=new Button("X");
        Button N9=new Button("Y");
        Button N0=new Button("Z");
        Button dot=new Button(".");
        Button Equals=new Button("=");
        Button minus=new Button("-");
        Button plus=new Button("+");
        Button multiple=new Button("*");
        Button division=new Button("/");
        numbers.add(BL,0,1);
        numbers.add(BR,1,1);
        numbers.add(factorial,2,1);
        numbers.add(N1,0,2);
        numbers.add(N2,1,2);
        numbers.add(N3,2,2);
        numbers.add(N4,0,3);
        numbers.add(N5,1,3);
        numbers.add(N6,2,3);
        numbers.add(N7,0,4);
        numbers.add(N8,1,4);
        numbers.add(N9,2,4);
        numbers.add(N0,1,5);
        numbers.add(dot,0,5);
        numbers.add(Equals,2,5);
        numbers.add(remove,3,1);
        numbers.add(minus,3,2);
        numbers.add(division,3,3);
        numbers.add(plus,3,4);
        numbers.add(multiple,3,5);
        numbers.setHgap(1.5);
        numbers.setVgap(1.5);
        remove.setOnMouseClicked(event -> {
            line=new StringBuilder();
            text.setText(line.toString());
            functionNumber=0;
            added=new StringBuilder();
        });
        N0.setOnMouseClicked(event -> {
            line.append("Z");
            text.setText(line.toString());
            Add("Z");
        });
        N1.setOnMouseClicked(event -> {
            line.append("A");
            text.setText(line.toString());
            Add("A");
        });
        N2.setOnMouseClicked(event -> {
            line.append("B");
            text.setText(line.toString());
            Add("B");
        });
        N3.setOnMouseClicked(event -> {
            line.append("C");
            text.setText(line.toString());
            Add("C");
        });
        N4.setOnMouseClicked(event -> {
            line.append("D");
            text.setText(line.toString());
            Add("D");
        });
        N5.setOnMouseClicked(event -> {
            line.append("E");
            text.setText(line.toString());
            Add("E");
        });
        N6.setOnMouseClicked(event -> {
            line.append("F");
            text.setText(line.toString());
            Add("F");
        });
        N7.setOnMouseClicked(event -> {
            line.append("G");
            text.setText(line.toString());
            Add("G");
        });
        N8.setOnMouseClicked(event -> {
            line.append("X");
            text.setText(line.toString());
            Add("X");
        });
        N9.setOnMouseClicked(event -> {
            line.append("Y");
            text.setText(line.toString());
            Add("Y");
        });
        Equals.setOnMouseClicked(event -> {
            Calculator.functions.addLast(new FunctionLine(line.toString(),functionNumber));
            stage.close();

        });
        division.setOnMouseClicked(event -> {
            line.append("/");
            text.setText(line.toString());
        });
        plus.setOnMouseClicked(event -> {
            line.append("+");
            text.setText(line.toString());
        });
        minus.setOnMouseClicked(event -> {
            line.append("-");
            text.setText(line.toString());
        });
        multiple.setOnMouseClicked(event -> {
            line.append("*");
            text.setText(line.toString());
        });
        factorial.setOnMouseClicked(event -> {
            line.append("!");
            text.setText(line.toString());
        });
        BR.setOnMouseClicked(event -> {
            line.append(")");
            text.setText(line.toString());
        });
        BL.setOnMouseClicked(event -> {
            line.append("(");
            text.setText(line.toString());
        });
        dot.setOnMouseClicked(event -> {
            line.append(".");
            text.setText(line.toString());
        });
        Scene scene=new Scene(vBox);
        numbers.getStylesheets().add("style.css");
        N0.setId("number");
        N1.setId("number");
        N2.setId("number");
        N3.setId("number");
        N4.setId("number");
        N5.setId("number");
        N6.setId("number");
        N7.setId("number");
        N8.setId("number");
        N9.setId("number");
        dot.setId("my-button");
        BL.setId("my-button");
        BR.setId("my-button");
        Equals.setId("Equal");
        remove.setId("delete");
        factorial.setId("my-button");
        division.setId("my-button");
        plus.setId("my-button");
        multiple.setId("my-button");
        minus.setId("my-button");
        text.setId("screen");
        stage.setScene(scene);
        return stage;
    }

}
