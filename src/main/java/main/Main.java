package main;

import UserInterface.SearchResult;
import config.IProjectConfig;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.aeonbits.owner.ConfigFactory;
import responses.YouTubeBody;
import services.ApiService;

import java.awt.*;
import java.io.IOException;

public class Main {
    private static final IProjectConfig config = ConfigFactory.create(IProjectConfig.class, System.getProperties());

    public static void main(String[] args) throws IOException {
        ApiService apiService = new ApiService();

        YouTubeBody body = apiService.sendGetRequest(config.baseURL(), "snippet", "1", "hello", config.apiKey()).getYouTubeBody();

        SearchResult searchResult = new SearchResult(body.getItems().get(0).getSnippet().getTitle(),
                body.getItems().get(0).getSnippet().getChannelTitle(),
                body.getItems().get(0).getSnippet().getPublishedAt());

        System.out.println(searchResult.toString());
    }
}
