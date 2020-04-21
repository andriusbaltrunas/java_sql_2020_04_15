package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

	@FXML
	private Label correctLabel;
	@FXML
	private Label incorrectLabel;
	@FXML
	private TextField numberTextField;

	public void speti(ActionEvent event) {
		Random random = new Random();
		int numb = random.nextInt(10) + 1;

		int userNumber = Integer.parseInt(numberTextField.getText());

		if(numb == userNumber){
			incorrectLabel.setText("");
			correctLabel.setText("Aspejote");
		} else {
			correctLabel.setText("");
			incorrectLabel.setText("Neaspejote " + numb);
		}
	}
}
