package Graphic;

import Calculation.Calculation;
import Storage.FunctionLine;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Calculator {
    public static FunctionLine function;
    public static String source="C:/Users/USER/Desktop/calculator/stack-Pooya-esfandany/untitled2/";
    static StringBuilder line=new StringBuilder("");
    static Button text=new Button(line.toString());

    public static Scene scene()
    {
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
        Button N1=new Button("1");
        Button N2=new Button("2");
        Button N3=new Button("3");
        Button N4=new Button("4");
        Button N5=new Button("5");
        Button N6=new Button("6");
        Button N7=new Button("7");
        Button N8=new Button("8");
        Button N9=new Button("9");
        Button N0=new Button("0");
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
        });
        N0.setOnMouseClicked(event -> {
            line.append("0");
            text.setText(line.toString());
        });
        N1.setOnMouseClicked(event -> {
            line.append("1");
            text.setText(line.toString());
        });
        N2.setOnMouseClicked(event -> {
            line.append("2");
            text.setText(line.toString());
        });
        N3.setOnMouseClicked(event -> {
            line.append("3");
            text.setText(line.toString());
        });
        N4.setOnMouseClicked(event -> {
            line.append("4");
            text.setText(line.toString());
        });
        N5.setOnMouseClicked(event -> {
            line.append("5");
            text.setText(line.toString());
        });
        N6.setOnMouseClicked(event -> {
            line.append("6");
            text.setText(line.toString());
        });
        N7.setOnMouseClicked(event -> {
            line.append("7");
            text.setText(line.toString());
        });
        N8.setOnMouseClicked(event -> {
            line.append("8");
            text.setText(line.toString());
        });
        N9.setOnMouseClicked(event -> {
            line.append("9");
            text.setText(line.toString());
        });
        Equals.setOnMouseClicked(event -> {
            String answer=text.getText();
            double x=Calculation.calculate(answer);
            text.setText(Double.toString(x));
            line=new StringBuilder(text.getText());
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
        text.setAlignment(Pos.CENTER_RIGHT);

        scene.getStylesheets().add("style.css");
        return scene;
    }

}