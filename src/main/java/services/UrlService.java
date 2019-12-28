package services;

import okhttp3.HttpUrl;

public class UrlService {

    HttpUrl createUrlForSearch(String baseUrl, String partVal, String maxResults, String qVal, String keyVal){
        return HttpUrl.parse(baseUrl)
                .newBuilder()
                .addPathSegment("search")
                .addQueryParameter("part", partVal)
                .addQueryParameter("maxResults", maxResults)
                .addQueryParameter("q", qVal)
                .addQueryParameter("key", keyVal)
                .build();
    }
}
