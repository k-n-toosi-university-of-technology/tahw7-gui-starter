package ir.ac.kntu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

  
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        Scene scene = new Scene(root, 800, 600, Color.rgb(240, 240, 240));
        
        //TODO your code goes here
        
        
        
        

        // Setting stage properties
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Hello JavaFX!");
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
