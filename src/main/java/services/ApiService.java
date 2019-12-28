package services;

import config.IProjectConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.aeonbits.owner.ConfigFactory;
import responses.YouTubeBody;

import java.io.IOException;

public class ApiService {

    private static final IProjectConfig config = ConfigFactory.create(IProjectConfig.class, System.getProperties());

    OkHttpClient client = new OkHttpClient();
    GetService getService = new GetService();
    PostService postService = new PostService();

    public String sendGetRequest(String url) throws IOException {
        String asQuery = "?part=snippet&maxResults=1&q=hello&key=AIzaSyCGb80YiFrBGofQ3eB_Q_CDoC6B0lnG1n8";
        Request request = getService.createGetRequest(url+"search"+asQuery);

        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }

    /*public String sendPostRequest() throws IOException {

    }*/
}
