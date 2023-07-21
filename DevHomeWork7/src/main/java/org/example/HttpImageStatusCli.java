package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpImageStatusCli {
    public void askStatus() throws IllegalArgumentException {
        System.out.println("Enter HTTP status code:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();
            try {
                int code = Integer.parseInt(input);
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                downloader.downloadStatusImage(code);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (IOException e) {
                System.out.println("There is no image for HTTP status " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
