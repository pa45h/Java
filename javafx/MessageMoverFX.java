import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MessageMoverFX extends Application {
    @Override
    public void start(Stage stage) {
        Text message = new Text("Hello, JavaFX!");
        message.setFill(Color.BLACK);

        Button left = new Button("Left");
        Button right = new Button("Right");

        left.setOnAction(e -> message.setX(message.getX() - 10));
        right.setOnAction(e -> message.setX(message.getX() + 10));

        HBox buttonBox = new HBox(10, left, right);
        buttonBox.setPadding(new Insets(10));

        RadioButton red = new RadioButton("Red");
        RadioButton blue = new RadioButton("Blue");
        ToggleGroup colors = new ToggleGroup();
        red.setToggleGroup(colors);
        blue.setToggleGroup(colors);

        red.setOnAction(e -> message.setFill(Color.RED));
        blue.setOnAction(e -> message.setFill(Color.BLUE));

        HBox radioBox = new HBox(10, red, blue);
        radioBox.setPadding(new Insets(10));

        BorderPane root = new BorderPane();
        root.setTop(radioBox);
        root.setCenter(message);
        root.setBottom(buttonBox);

        stage.setTitle("Message Mover – Name: Parth Katariya | Enrollment No: 230410107073");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
