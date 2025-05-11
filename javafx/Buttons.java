import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Buttons extends Application{
	
	Circle c1;
	Rectangle r1;
	Rectangle s1;

	public static void main(String[] args) {
		launch(args);

	}
	
	public void start(Stage stage) throws Exception
	{
		
		Button b1 = new Button("Circle");
		Button b2 = new Button("Rectangle");
		Button b3 = new Button("Square");
		
		Button b4 = new Button("Red");
		Button b5 = new Button("Green");
		Button b6 = new Button("Blue");
		
		b1.setLayoutX(50);
		b1.setLayoutY(50);
		b1.setMaxSize(120, 60);
		
		b2.setLayoutX(400);
		b2.setLayoutY(50);
		b2.setMaxSize(120, 60);
		
		b3.setLayoutX(800);
		b3.setLayoutY(50);
		b3.setMaxSize(120, 60);
		
		b4.setLayoutX(50);
		b4.setLayoutY(100);
		b4.setMaxSize(120, 60);
		
		b5.setLayoutX(400);
		b5.setLayoutY(100);
		b5.setMaxSize(120, 60);
		
		b6.setLayoutX(800);
		b6.setLayoutY(100);
		b6.setMaxSize(120, 60);
		
		Group root = new Group(b1,b2,b3,b4,b5,b6);
		Scene scene = new Scene(root,1200,700);
		
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{
				c1 = new Circle(500,400,100);
				
				root.getChildren().add(c1);
				root.getChildren().remove(r1);
				root.getChildren().remove(s1);
			}
			
		});
		
		b4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{	
				c1.setFill(Color.RED);
				r1.setFill(Color.RED);
				s1.setFill(Color.RED);
			}
			
		});
		
		b2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{
				r1 = new Rectangle(200,250,500,400);
				
				root.getChildren().remove(c1);
				root.getChildren().add(r1);
				root.getChildren().remove(s1);
			}
		});
		
		b5.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{	
				c1.setFill(Color.GREEN);
				r1.setFill(Color.GREEN);
				s1.setFill(Color.GREEN);
			}
			
		});

		b3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{
				s1 = new Rectangle(200,250,400,400);
				
				root.getChildren().remove(c1);
				root.getChildren().remove(r1);
				root.getChildren().add(s1);
			}
		});
		
	b6.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) 
			{	
				c1.setFill(Color.BLUE);
				r1.setFill(Color.BLUE);
				s1.setFill(Color.BLUE);
			}
			
		});
		
		stage.setScene(scene);
		stage.show();
	}

}
