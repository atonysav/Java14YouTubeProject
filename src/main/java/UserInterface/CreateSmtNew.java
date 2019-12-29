package UserInterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public interface CreateSmtNew { //создание элементов 
    Button buttonSearch = new Button("Search");// кнопка
    Button buttonView = new Button("View");
    TextField textField = new TextField();
    VBox vBox = new VBox();
    HBox hBox = new HBox();
    SearchResult searchResult1 = new SearchResult("Run to the Forest", "Forest", "22-05-2019");
    SearchResult searchResult2 = new SearchResult("Run to the Forest2", "Forest2", "22-05-2019");
    ObservableList<SearchResult> searchResults = FXCollections.observableArrayList(searchResult1,searchResult2);
    ListView<SearchResult> listView = new ListView<SearchResult>(searchResults);
    Stage mainStage = new Stage();
    Scene scene = new Scene(vBox, 700, 350);

}
