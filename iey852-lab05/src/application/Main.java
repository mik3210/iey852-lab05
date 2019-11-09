package application;
	
import application.contoller.MainController;
import application.model.Park;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	MainController main = new MainController();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
			
			
			main.loadImageView();
			
			//loader.setController("MainController");
			Parent root = loader.load(); 
			Scene myScene = new Scene(root, 600, 600);
			primaryStage.setScene(myScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		Park p = new Park("Jurrasic Park");
		p.loadZones();
		p.loadDinosaurs();
		System.out.println(p.getZone());
	}
}
