package main;

import config.IProjectConfig;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.aeonbits.owner.ConfigFactory;
import services.ApiService;

import java.awt.*;
import java.io.IOException;

public class Main {
    private static final IProjectConfig config = ConfigFactory.create(IProjectConfig.class, System.getProperties());

    public static void main(String[] args) throws IOException {
        ApiService apiService = new ApiService();

        System.out.println(apiService.sendGetRequest(config.baseURL(), "snippet", "2", "hello", config.apiKey())
        .getYouTubeBody()
        .getItems().get(0)
        .getSnippet()
        .getThumbnails()
        .getHigh()
        .getUrl());

    }
}
