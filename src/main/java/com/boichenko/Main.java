package com.boichenko;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(HttpStatusChecker.getStatusImage(404));
//        HttpStatusImageDownloader.downloadStatusImage(500);
        HttpImageStatusCli.askStatus();
    }

}