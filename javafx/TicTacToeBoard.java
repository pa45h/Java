import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class TicTacToeBoard extends Application {
    private static final int SIZE = 3;
    private static final String X_IMAGE_PATH = "X.gif";
    private static final String O_IMAGE_PATH = "O.gif";

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        Random random = new Random();

        Image xImage = new Image(X_IMAGE_PATH);
        Image oImage = new Image(O_IMAGE_PATH);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                int choice = random.nextInt(3); // 0: empty, 1: X, 2: O

                ImageView imageView = null;

                switch (choice) {
                    case 1:
                        imageView = new ImageView(xImage);
                        break;
                    case 2:
                        imageView = new ImageView(oImage);
                        break;
                    default:
                        imageView = new ImageView(); // empty
                        break;
                }

                // Optional: Set a fixed size for the cells
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                imageView.setPreserveRatio(true);

                grid.add(imageView, col, row);
            }
        }

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Random Tic-Tac-Toe Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}