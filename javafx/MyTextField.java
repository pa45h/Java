import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MyTextField extends Application
{

	public static void main(String[] args) 
	{
		launch(args);
	}

	public void start(Stage stage) throws Exception
	{
		TextField tf = new TextField();
		TextArea ta = new TextArea();
		
		tf.setLayoutX(100);
		tf.setLayoutY(100);
		tf.setMaxSize(120, 60);
		
		ta.setLayoutX(100);
		ta.setLayoutY(200);
		ta.setMaxSize(120, 300);
		
		tf.setOnKeyPressed(new EventHandler<KeyEvent>()
		{

			@Override
			public void handle(KeyEvent ke) 
			{
				if(ke.getCode().equals(KeyCode.ENTER))
				{
					String s = tf.getText();
					ta.appendText(s+"\n");
					tf.setText("");
				}
				
			}
			
		});
		
		Group root = new Group(tf,ta);
		Scene scene = new Scene(root,1000,700);
		
		stage.setScene(scene);
		stage.show();
	}
}
