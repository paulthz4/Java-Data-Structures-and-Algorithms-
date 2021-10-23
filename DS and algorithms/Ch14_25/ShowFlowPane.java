package Ch14_25;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		//place nodes in pane
		pane.getChildren().addAll(new Label("First Name:"),
				new TextField(), new Label("MI:"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
		
		//create a  scene 
		Scene scene = new Scene(pane, 200, 200);
		arg0.setTitle("Show Flow Pane");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) { 
	    launch(args);
	  }
}
