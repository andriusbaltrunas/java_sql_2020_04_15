package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Label emptyTextLabel;
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField surnameTextField;

	public void sayHi(ActionEvent event){
		String name = nameTextField.getText();
		String surname = surnameTextField.getText();

		emptyTextLabel.setText(String.format("Labas %s %s", name, surname));
	}
}
