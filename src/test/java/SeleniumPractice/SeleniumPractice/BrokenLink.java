package SeleniumPractice.SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		String link="https://opensource-demo.orangehrmlive.com";
		URL url=new URL(link);
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.connect();
		int code=connection.getResponseCode();
		System.out.println(code);

	}

}
