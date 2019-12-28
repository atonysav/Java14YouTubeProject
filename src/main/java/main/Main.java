package main;

import config.IProjectConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.aeonbits.owner.ConfigFactory;
import services.ApiService;

import java.io.IOException;

public class Main {

    private static final IProjectConfig config = ConfigFactory.create(IProjectConfig.class, System.getProperties());

    public static void main(String[] args) throws IOException {

        ApiService apiService = new ApiService();
        System.out.println(apiService.sendGetRequest(config.baseURL())
                .getYouTubeBody()
                .getItems()
                .get(0)
                .getSnippet()
                .getThumbnails()
                .getHigh()
                .getUrl()
                );
    }
}
