import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class TestProyecto  extends Application {
	
	@Override
    public void start(Stage stage) throws Exception {
		
        Parent root = FXMLLoader.load(getClass().getResource("ejemplobase.fxml"));
        ///ListBooks
        
        
        
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 600, 480));
        
        ObservableList<String> data = FXCollections.observableArrayList();

        ListView<String> listView = (ListView<String>)root.lookup("#ListBooks"); //new ListView<String>(data);
        System.out.println(listView);
        //listView.setPrefSize(200, 250);
        

        data.addAll("A", "B", "C", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E", "D", "E");

        listView.setItems(data);
        listView.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends String> ov, String old_val, String new_val) ->
            {
                    System.out.println(new_val);
                    
            });
        
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(TestProyecto.class, args);
    }

}
