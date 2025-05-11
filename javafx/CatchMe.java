import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CatchMe extends Application{
	Random ra = new Random();

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void start(Stage stage) throws Exception 
	{
		Label lab = new Label("Is Vikas sir intelligent ??");
		Button by = new Button("Yes");
		Button bn = new Button("No");
		
		lab.setLayoutX(50);
		lab.setLayoutY(50);
		lab.setMaxSize(700,80);
		
		lab.setFont(new Font("Verdana",40));
		
		by.setLayoutX(150);
		by.setLayoutY(150);
		by.setMaxSize(600, 80);
		
		bn.setLayoutX(350);
		bn.setLayoutY(150);
		bn.setMaxSize(600, 80);
		
		by.setOnMouseEntered(new EventHandler<MouseEvent>() {

			public void handle (MouseEvent me) {
				
				//by.setText("No");
				//by.setVisible(false);
				int x = ra.nextInt(900);
				int y = ra.nextInt(600);
				by.setLayoutX(x);
				by.setLayoutY(y);
			}
		});
		
		by.setOnMouseExited(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent me) {
				//by.setText("Yes");
			}
		});
		
		Group root = new Group(lab,by,bn);
		Scene scene = new Scene(root,1200,700);
		scene.setFill(Color.PINK);
		stage.setScene(scene);
		stage.show();
	}

}
