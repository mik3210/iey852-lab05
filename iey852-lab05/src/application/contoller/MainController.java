package application.contoller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController implements EventHandler<ActionEvent> {
	@FXML
	Button zoneB;
	@FXML
	Button zoneD;
	@FXML
	Button zoneG;
	@FXML
	Button zoneR;
	@FXML
	Button zoneTR;
	@FXML
	Button zoneTY;
	@FXML
	Button zoneX;

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
	
	public void loadZoneScreen(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Zone.fxml"));
			Scene scene = new Scene(root);
			
			//This line gets the stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

			window.setScene(scene);
			window.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	public void bButton(ActionEvent event) {
		loadZoneScreen(event);
		
		
	}
	
	@FXML
	public void dButton(ActionEvent event) {
		loadZoneScreen(event);		
	}
	
	@FXML
	public void gButton(ActionEvent event) {
		loadZoneScreen(event);		
	}
	
	@FXML
	public void rButton(ActionEvent event) {
		loadZoneScreen(event);		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void trButton(ActionEvent event) {
		loadZoneScreen(event);		
	}
	
	@FXML
	public void tyButton(ActionEvent event) {
		loadZoneScreen(event);		
	}
	
	@FXML
	public void xButton(ActionEvent event) {
		loadZoneScreen(event);		
	}


	

}
