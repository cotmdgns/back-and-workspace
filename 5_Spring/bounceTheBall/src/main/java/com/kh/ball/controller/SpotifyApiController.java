package com.kh.ball.controller;

import java.io.IOException;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import com.wrapper.spotify.requests.data.search.SearchItemRequest;

public class SpotifyApiController {

	public static final String CLIENT_ID = "2a2c3a62978f4625a84b78c5eec183f6";
	public static final String CLIENT_SECRET = "92533be564574f33a591c6d8b55edbe8";

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .build();

    public static void main(String[] args) {
    	SpotifyApiController a = new SpotifyApiController();
        try {
            ClientCredentials clientCredentials = spotifyApi.clientCredentials().build().execute();
            String accessToken = clientCredentials.getAccessToken();
            System.out.println("Access Token: " + accessToken);
            System.out.println(""+spotifyApi.searchAlbums("안녕"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void searchTrack(String Track) {
    	SearchItemRequest searchItemRequest = spotifyApi.searchItem(Track, "Track").build();
    }

}
