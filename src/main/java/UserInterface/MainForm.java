package UserInterface;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.*;


public class MainForm extends Application implements CreateSmtNew {

    public MainForm() {

    }

    @Override
    public void start(Stage stage) throws Exception {
        buttonView.setOnAction(event -> {
            ObservableList searchResults1 = listView.getSelectionModel().getSelectedIndices();
            for(Object o : searchResults1){
                textField.setText(listView.getItems().get((Integer) o).getChannelName());
                watchVideo();    //Открытие сцены с видео из листа
            }
        });
       // Group group = new Group(button);                // вложенный узел Group
        buttonSearch.setOnAction(event -> {
            getSearchRequest();
        });
        saveVBox();

        mainStage.setScene(scene);                          // установка Scene для Stage
        mainStage.setTitle("Main Form");
        mainStage.sizeToScene();
        mainStage.show();
    }

    void watchVideo(){
        String url = "https://www.youtube.com/embed/i6xswALsyFI";
        Stage stage = new Stage();
        stage.setTitle("Watch Video Form");
        stage.initModality(Modality.WINDOW_MODAL);
        WebView webview = new WebView();
        webview.getEngine().load(url);
        webview.setPrefSize(640, 390);

        stage.setScene(new Scene(webview));
        stage.show();
        mainStage.close();
    }

    public String getSearchRequest(){
        String searchRequest;
        searchRequest = textField.getText();
        return searchRequest;
    }

    void saveVBox(){
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(15,20,10,10));
        vBox.getChildren().add(textField);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(buttonSearch);
        vBox.getChildren().add(borderPane);
        vBox.getChildren().add(hBox);
        vBox.getChildren().addAll(listView,buttonView);
    }

}

