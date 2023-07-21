package org.example;

public class Main {
    public static void main(String[] args) {
        HttpImageStatusCli cli = new HttpImageStatusCli();
        try {
            cli.askStatus();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid HTTP status code entered: " + e.getMessage());
        }
    }
}