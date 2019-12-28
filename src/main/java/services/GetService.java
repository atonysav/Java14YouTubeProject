package services;

import okhttp3.Request;

public class GetService {

    public Request createGetRequest(String url){
        return new Request.Builder()
                .url(url)
                .get()
                .build();
    }
}
