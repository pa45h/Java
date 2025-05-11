import javax.swing.text.Element;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tic-Tac-Toe – Name: Parth Katariya | Enrollment No: 230410107073");
        
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int n = (int) (Math.random() * 3);
                if (n == 0) {
                    pane.add(new ImageView((Image) new Image(getClass().getResource("X.gif").toExternalForm(),200,200,true,true)), col, row);
                } else if (n == 1) {
                    pane.add(new ImageView((Image) new Image(getClass().getResource("O.gif").toExternalForm(),200,200,true,true)), col, row);
                }
            }
        }

        Scene scene = new Scene(pane, 1000,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
