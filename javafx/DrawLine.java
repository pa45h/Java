import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawLine extends Application{
	Group root;
	double sc,sr,ec,er;
	Line l;
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void start(Stage stage) throws Exception
	{
		root = new Group();
		Scene scene = new Scene(root,1200,700);
		
		scene.setOnMousePressed(new EventHandler<MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent me) 
			{
				sc = me.getX();
				sr = me.getY();
				l = new Line(sc,sr,sc,sr);
				
				root.getChildren().add(l);
			}
			
		});
		
		scene.setOnMouseDragged(new EventHandler<MouseEvent>()
		{

			@Override
			public void handle(MouseEvent me) 
			{
				ec = me.getX();
				er = me.getY();
				
				root.getChildren().remove(l);//
				
				l = new Line(sc,sr,ec,er);
				root.getChildren().add(l);
			}
			
		});
		
		stage.setScene(scene);
		stage.show();
	}

}
