import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstFx extends Application
{

	public static void main(String[] args) 
	{
		launch(args);	//to call start();
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		Group root = new Group();
		
		Scene scene = new Scene(root,1000,600);
		
		scene.setFill(Color.PINK);
		
		stage.setScene(scene);
		
		stage.show();
		
	}

}
