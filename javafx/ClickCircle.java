import java.beans.EventHandler;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ClickCircle extends Application
{
	Group root;
	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage stage) throws Exception
	{
		
		Group root = new Group();
		Scene scene = new Scene(root,1200,700);
		scene.setFill(Color.BLACK);
		
		scene.setOnMouseClicked(new javafx.event.EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent me) {
				double c = me.getX();
				double r = me.getY();
				Circle c1 = new Circle(c,r,50);
				c1.setFill(Color.WHITE);
				root.getChildren().add(c1);
			}
			
			
		});
		
		
		stage.setScene(scene);
		stage.show();
	}

}
