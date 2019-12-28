package services;

import responses.YouTubeBody;

public class ResponceReceiver {

    private final YouTubeBody youTubeBody;

    ResponceReceiver(YouTubeBody youTubeBody) {
        this.youTubeBody = youTubeBody;
    }

    public YouTubeBody getYouTubeBody() {
        return youTubeBody;
    }
}
