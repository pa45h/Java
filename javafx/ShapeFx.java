import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ShapeFx extends Application{

	public static void main(String[] args) 
	{	
		launch(args);
	}
	
	public void start(Stage stage) throws Exception
	{
		Line l1 = new Line(10,10,200,10);
//		Line l1 = new Line(sc,sr,ec,er);
		
		Line l2 = new Line(10,10,10,200);
		
		Rectangle r1 = new Rectangle(50,50,200,200);
		r1.setFill(Color.RED);
		
		Rectangle r2 = new Rectangle(300,50,200,100);
		r2.setFill(Color.BLUE);
		
		Circle c1 = new Circle(450,300,100);
		c1.setFill(Color.YELLOW);
		
		
		Group root = new Group(l1,l2,r1,r2,c1);
		
		Scene scene = new Scene(root,1200,700);
		stage.setScene(scene);
		
		scene.setFill(Color.PINK);
		stage.setTitle("Welcome To FX!");
		
		stage.show();
	}

}
