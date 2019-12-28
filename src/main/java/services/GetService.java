package services;

import okhttp3.Request;

class GetService {

    Request sendGetRequest(String baseUrl, String partVal, String maxResults, String qVal, String keyVal){
        return new Request.Builder()
                .url(new UrlService().createUrlForSearch(baseUrl, partVal, maxResults, qVal, keyVal))
                .get()
                .build();
    }
}
