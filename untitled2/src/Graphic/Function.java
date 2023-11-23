package Graphic;

import Calculation.Calculation;
import Storage.FunctionLine;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Function {
    static StringBuilder line = new StringBuilder();
    static Button text = new Button(line.toString());
    static StringBuilder added = new StringBuilder();
    static int functionNumber = 0;

    static void Add(String a) {
        if (!added.toString().contains(a)) {
            added.append(a);
        }
    }

    public static Stage stage() {
        Stage stage = new Stage();
        {
            VBox vBox = new VBox();
            vBox.getChildren().add(text);
            GridPane numbers = new GridPane();
            vBox.getChildren().add(numbers);
            text.setPrefWidth(75);
            Button remove = new Button("C");
            Button back = new Button("<=");
            Button BL = new Button("(");
            Button BR = new Button(")");
            Button factorial = new Button("!");
            Button N1 = new Button("A");
            Button N2 = new Button("B");
            Button N3 = new Button("C");
            Button N4 = new Button("D");
            Button N5 = new Button("E");
            Button N6 = new Button("F");
            Button N7 = new Button("G");
            Button N8 = new Button("X");
            Button N9 = new Button("Y");
            Button N0 = new Button("Z");
            Button dot = new Button("W");
            Button Equals = new Button("=");
            Button minus = new Button("-");
            Button plus = new Button("+");
            Button multiple = new Button("×");
            Button division = new Button("÷");
            numbers.add(BL, 3, 0);
            numbers.add(BR, 4, 0);
            numbers.add(factorial, 5, 0);
            numbers.add(N1, 3, 1);
            numbers.add(N2, 4, 1);
            numbers.add(N3, 5, 1);
            numbers.add(N4, 3, 2);
            numbers.add(N5, 4, 2);
            numbers.add(N6, 5, 2);
            numbers.add(N7, 3, 3);
            numbers.add(N8, 4, 3);
            numbers.add(N9, 5, 3);
            numbers.add(N0, 3, 4);
            numbers.add(dot, 4, 4);
            numbers.add(Equals, 5, 4);
            numbers.add(remove, 6, 0);
            numbers.add(minus, 6, 1);
            numbers.add(division, 6, 2);
            numbers.add(plus, 6, 3);
            numbers.add(multiple, 6, 4);
            numbers.setHgap(1.5);
            numbers.setVgap(1.5);
            GridPane function = new GridPane();
            Button sin = new Button("Sin(x)");
            sin.setId("my-button");
            Button cos = new Button("Cos(x)");
            cos.setId("my-button");
            Button tan = new Button("Tan(x)");
            tan.setId("my-button");
            Button cot = new Button("Cot(x)");
            cot.setId("my-button");
            Button P = new Button("π");
            P.setId("my-button");
            Button e = new Button("e");
            e.setId("my-button");
            Button F = new Button("F(x)");
            F.setId("my-button");
            Button sqrt = new Button("√");
            sqrt.setId("my-button");
            Button power = new Button("x^y");
            power.setId("my-button");
            Button log = new Button("Log(x)");
            log.setId("my-button");
            numbers.add(P, 0, 0);
            function.setHgap(1.5);
            function.setVgap(1.5);
            numbers.add(e, 1, 0);
            numbers.add(sin, 0, 1);
            numbers.add(cos, 1, 1);
            numbers.add(tan, 0, 2);
            numbers.add(cot, 1, 2);
            numbers.add(sqrt, 0, 3);
            numbers.add(power, 1, 3);
            numbers.add(log, 0, 4);
            numbers.add(F, 1, 4);
            remove.setOnMouseClicked(event -> {
                line = new StringBuilder();
                text.setText(line.toString());
            });
            dot.setOnMouseClicked(event -> {
                line.append("W");

                text.setText(line.toString());
            });

            N0.setOnMouseClicked(event -> {
                line.append("Z");
                text.setText(line.toString());
            });
            N1.setOnMouseClicked(event -> {
                line.append("A");
                Add("A");
                text.setText(line.toString());
            });
            N2.setOnMouseClicked(event -> {
                line.append("B");Add("B");
                text.setText(line.toString());
            });
            N3.setOnMouseClicked(event -> {
                line.append("C");
                Add("C");
                text.setText(line.toString());
            });
            N4.setOnMouseClicked(event -> {
                line.append("D");
                Add("D");
                text.setText(line.toString());
            });
            N5.setOnMouseClicked(event -> {
                line.append("E");
                Add("E");
                text.setText(line.toString());
            });
            N6.setOnMouseClicked(event -> {
                line.append("F");
                Add("F");
                text.setText(line.toString());
            });
            N7.setOnMouseClicked(event -> {
                line.append("G");
                Add("G");
                text.setText(line.toString());
            });
            N8.setOnMouseClicked(event -> {
                line.append("X");
                Add("X");
                text.setText(line.toString());
            });
            N9.setOnMouseClicked(event -> {
                line.append("Y");
                Add("Y");
                text.setText(line.toString());
            });
            Equals.setOnMouseClicked(event -> {
                String cal=text.getText();
                String chars=added.toString();
                FunctionLine functionLine=new FunctionLine(cal,chars);
                System.out.println(cal);
                System.out.println(chars);
                Calculator.functions=functionLine;
                stage.close();

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
            log.setOnMouseClicked(event -> {
                line.append("Log(");
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
                line.append("√(");
                text.setText(line.toString());
            });
            Scene scene = new Scene(vBox);
            vBox.setSpacing(5);
            HBox hBox = new HBox();
            hBox.getChildren().addAll(numbers);
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
            stage.setScene(scene);
            vBox.getStylesheets().add("style.css");
        }
        return stage;
    }

}