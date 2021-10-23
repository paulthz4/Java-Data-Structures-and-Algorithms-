package Ch14_25;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ControlCircle extends Application {
	private CirclePane circlepane = new CirclePane();

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

		HBox box = new HBox(10);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
//		box.getChildren().addAll(new Button("Enlarge"), new Button("Shrink"));
		Button enlargebtn = new Button("Enlarge");
		Button shrinkbtn = new Button("Shrink");
		box.getChildren().addAll(enlargebtn, shrinkbtn);
		//create and register handler
		enlargebtn.setOnAction(new EnlargeHandler());
		shrinkbtn.setOnAction(new ShrinkHandler());
		

		BorderPane borderpane = new BorderPane();
		borderpane.setCenter(circlepane);
		borderpane.setBottom(box);
		borderpane.setAlignment(box, Pos.CENTER);

		Scene scene = new Scene(borderpane, 200, 200);
		arg0.setTitle("Control Circle");
		arg0.setScene(scene);
		arg0.show();
	}
	//inner class
	class EnlargeHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			circlepane.enlarge();
		}

	}
	//inner class
	class ShrinkHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			circlepane.shrink();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
