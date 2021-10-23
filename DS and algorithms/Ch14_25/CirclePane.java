package Ch14_25;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {
	private Circle circle = new Circle(50);

	public CirclePane() {
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.CORAL);
		getChildren().add(circle);
	}

	public void enlarge() {
		circle.setRadius(circle.getRadius() + 10);
	}

	public void shrink() {
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 10 : circle.getRadius());
	}
}
