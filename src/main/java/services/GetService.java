package services;

import okhttp3.Request;

class GetService {

    Request createGetRequest(String url){
        return new Request.Builder()
                .url(url)
                .get()
                .build();
    }
}
