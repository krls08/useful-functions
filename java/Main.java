//package albira;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//public class  MainHttpReq {
public class  Main {

    private static HttpURLConnection connection;

	public static void main(String[] args) {
		System.out.println("Start program");
		// Method 1: -> java 8 :: java.net.HttpURLConnection

        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        
        try {
            //URL url = new URL (spec: "https://jsonplaceholder.typicode.com/albums");
            URL url = new URL ("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            // Request setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // Treat response form the server
            int status = connection.getResponseCode();
            // System.out.println(status);
            
            if(status > 299) {
                reader = new BufferedReader( new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader( new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            
            System.out.println(responseContent.toString());

        } catch (MalformedURLException malfEx) {
            malfEx.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        } finally {
            connection.disconnect();
        }
	}
}
