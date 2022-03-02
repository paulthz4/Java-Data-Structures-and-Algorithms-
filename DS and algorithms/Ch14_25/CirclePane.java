package Ch14_25;

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
