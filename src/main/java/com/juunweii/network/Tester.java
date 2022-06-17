package com.juunweii.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.kcg.gov.tw/api/service/get/f72b68ab-ad33-4c22-9e09-c520c40f3f2e");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));

            StringBuffer json = new StringBuffer();

            String line = in.readLine();
            while (line != null){
//                System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
            System.out.println(json);



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
