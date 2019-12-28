package services;

import okhttp3.Request;
import okhttp3.RequestBody;

public class PostService {

    public Request createPostRequest(String url, RequestBody body){
        return new Request.Builder()
                .url(url)
                .post(body)
                .build();
    }
}
