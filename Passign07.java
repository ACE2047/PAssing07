package ch14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Passign07 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BorderPane mainPane = new BorderPane();

        GridPane numPad = new GridPane();
        numPad.setHgap(10);
        numPad.setVgap(10);

        Button call = new Button("Call");
        call.setPrefSize(80, 50);
        call.setStyle("-fx-border-width:3;-fx-border-color: white;-fx-background-color: green;-fx-text-fill: white ");
        call.setAlignment(Pos.CENTER);

        Button hangUp = new Button("Hang up");
        hangUp.setStyle("-fx-border-width:3;-fx-border-color: black;-fx-background-color: red; ");
        hangUp.setPrefSize(80, 50);
        hangUp.setAlignment(Pos.CENTER);

        KeyPadPane keyPane = new KeyPadPane(true);
        numPad.setAlignment(Pos.CENTER);
        numPad.add(keyPane, 0, 0);

        GridPane funPad = new GridPane();
        funPad.setHgap(10);
        funPad.setVgap(10);
        funPad.add(call, 0, 1);
        funPad.add(hangUp, 0, 4);

        GridPane mainPad = new GridPane();
        mainPad.add(funPad, 0, 0);
        mainPad.add(keyPane, 1, 0);

        keyPane.setStyle("-fx-font-size: 30;");
        keyPane.setAlignment(Pos.CENTER);
        keyPane.setPrefSize(30, 30);

        mainPane.setCenter(mainPad);
        mainPane.setStyle("-fx-border-color:white; -fx-background-image:url(\"https://as2.ftcdn.net/v2/jpg/01/65/95/31/1000_F_165953143_sgnCcTjVefj03KPzwVCRCWORGHYJ5tan.jpg\")");

        // create your scene (400 x 400 to clearly show KeyPadPane)
        Scene scene = new Scene(mainPane, 400, 400);

        primaryStage.setTitle("KeyPadPane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
