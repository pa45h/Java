import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveCircleFX extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(200, 200, 25, Color.BLUE);
        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 400, 400);
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP)
                circle.setTranslateY(circle.getTranslateY() - 10);
            else if (e.getCode() == KeyCode.DOWN)
                circle.setTranslateY(circle.getTranslateY() + 10);
            else if (e.getCode() == KeyCode.LEFT)
                circle.setTranslateX(circle.getTranslateX() - 10);
            else if (e.getCode() == KeyCode.RIGHT)
                circle.setTranslateX(circle.getTranslateX() + 10);
        });
        stage.setTitle("Move Circle – Name: Parth Katariya | Enrollment No: 230410107073");
        stage.setScene(scene);
        stage.show();
        pane.requestFocus();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
