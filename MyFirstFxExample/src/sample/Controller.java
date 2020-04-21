package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

	@FXML
	private Label myFirstLabel;

	private int count = 0;

	public void changeText(ActionEvent actionEvent) {
		myFirstLabel.setText("Label text changed " + ++count);
	}
}
