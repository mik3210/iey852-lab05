package application.contoller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.Park;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class ZoneController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Label zoneLabel;
	@FXML
	Label numOfDinosuarsLabel;
	@FXML
	Label threatLevelLabel;
	@FXML
	ListView<String> view = new ListView<>();
	@FXML
	TextField nameAddTextField;
	@FXML
	TextField typeTextField;
	@FXML
	ToggleButton carnivoreToggle;
	@FXML
	Button addButton;
	@FXML
	TextField nameRelocateTextField;
	@FXML
	TextField zoneTextField;
	@FXML
	Button relocateButton;
	@FXML
	Label relocationLabel;
	Park park = new Park("Jurassic Park");
	
	@FXML
	@Override
	public void handle(ActionEvent event) {
		
		
	}//end of handle method

	public void populateScreenR(){
		park.loadZones();
		park.loadDinosaurs();
		view.getItems().add("Hello World");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}//end of ZoneController class

