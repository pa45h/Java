import java.beans.EventHandler;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ClickCircleColoured extends Application{
	Group root;
	Random ra = new Random();
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start (Stage stage) throws Exception
	{
		root = new Group();
		Scene scene = new Scene(root,1200,700);
		
		scene.setOnMouseClicked(new javafx.event.EventHandler <MouseEvent>()
		{
			public void handle(MouseEvent me)
			{
				double c = me.getX();
				double r = me.getY();
				
				int rr = ra.nextInt(265);
				int gg = ra.nextInt(265);
				int bb = ra.nextInt(265);
				
				Circle c1 = new Circle(c,r,50);
				
				c1.setFill(Color.rgb(rr,gg,bb));
				root.getChildren().add(c1);
			}
		});
		
		scene.setFill(Color.GREY);
		stage.setScene(scene);
		stage.show();
	}
}
