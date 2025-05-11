import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleColorFX extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(200, 200, 50, Color.BLUE);
        
        circle.setOnMousePressed(e -> circle.setFill(Color.RED));
        circle.setOnMouseReleased(e -> circle.setFill(Color.BLUE));
        
        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 400, 400);
        
        stage.setTitle("Circle Color FX – Name: Parth Katariya | Enrollment No: 230410107073");
        stage.setScene(scene);
        stage.show();
        
        pane.requestFocus();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
