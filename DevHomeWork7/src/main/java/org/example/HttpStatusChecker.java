package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public String getStatusImage(int code) {
        String url = "https://http.cat/" + code + ".jpg";
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                return url;
            } else {
                System.out.println("There is no image for HTTP status " + code);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while checking the HTTP status: " + e.getMessage());
        }
        return "";
    }
}