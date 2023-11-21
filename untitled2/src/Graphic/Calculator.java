package Graphic;

import Calculation.Calculation;
import Storage.FunctionLine;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.LinkedList;

public class Calculator {
    public static LinkedList<FunctionLine> functions =new LinkedList<>();
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

        numbers.add(BL,3,0);
        numbers.add(BR,4,0);
        numbers.add(factorial,5,0);
        numbers.add(N1,3,1);
        numbers.add(N2,4,1);
        numbers.add(N3,5,1);
        numbers.add(N4,3,2);
        numbers.add(N5,4,2);
        numbers.add(N6,5,2);
        numbers.add(N7,3,3);
        numbers.add(N8,4,3);
        numbers.add(N9,5,3);
        numbers.add(N0,3,4);
        numbers.add(dot,4,4);
        numbers.add(Equals,5,4);
        numbers.add(remove,6,0);
        numbers.add(minus,6,1);
        numbers.add(division,6,2);
        numbers.add(plus,6,3);
        numbers.add(multiple,6,4);
        numbers.setHgap(1.5);
        numbers.setVgap(1.5);
        GridPane function=new GridPane();
        Button sin=new Button("Sin(x)");
        sin.setId("my-button");
        Button cos=new Button("Cos(x)");
        cos.setId("my-button");
        Button tan=new Button("Tan(x)");
        tan.setId("my-button");
        Button cot=new Button("Cot(x)");
        cot.setId("my-button");
        Button P=new Button("π");
        P.setId("my-button");
        Button e=new Button("e");
        e.setId("my-button");
        Button F=new Button("F(x)");
        F.setId("my-button");
        Button sqrt=new Button("√");
        sqrt.setId("my-button");
        Button power=new Button("x^y");
        power.setId("my-button");
        Button log=new Button("Log(x)");
        log.setId("my-button");
        numbers.add(P,0,0);
        function.setHgap(1.5);
        function.setVgap(1.5);
        numbers.add(e,1,0);
        numbers.add(sin,0,1);
        numbers.add(cos,1,1);
        numbers.add(tan,0,2);
        numbers.add(cot,1,2);
        numbers.add(sqrt,0,3);
        numbers.add(power,1,3);
        numbers.add(log,0,4);
        numbers.add(F,1,4);
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
            answer=answer.replace("e","2.718281");
            answer=answer.replace("π","3.1415926");
            answer=answer.replace("Tan","T");
            answer=answer.replace("sin","s");
            answer=answer.replace("Cos","c");
            answer=answer.replace("Cot","C");
            double x=Calculation.calculate(answer);
            text.setText(Double.toString(x));
            line=new StringBuilder(text.getText());
        });
        sin.setOnMouseClicked(event -> {
            line.append("sin(");
            text.setText(line.toString());
        });
        cos.setOnMouseClicked(event -> {
            line.append("Cos(");
            text.setText(line.toString());
        });
        tan.setOnMouseClicked(event -> {
            line.append("Tan(");
            text.setText(line.toString());
        });
        cot.setOnMouseClicked(event -> {
            line.append("Cot(");
            text.setText(line.toString());
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
        power.setOnMouseClicked(event -> {
            line.append("^");
            text.setText(line.toString());
        });
        e.setOnMouseClicked(event -> {
            line.append("e");
            text.setText(line.toString());
        });
        P.setOnMouseClicked(event -> {
            line.append("π");
            text.setText(line.toString());
        });
        sqrt.setOnMouseClicked(event -> {
            line.append("√");
            text.setText(line.toString());
    });
        Scene scene=new Scene(vBox);
        vBox.setSpacing(5);
        HBox hBox=new HBox();
        hBox.getChildren().addAll(numbers,function);
        vBox.getChildren().add(hBox);
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
