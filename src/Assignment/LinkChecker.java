package Assignment;

import java.net.HttpURLConnection;
import java.net.URL;

public class LinkChecker {
	public static void main(String[] args) {
        String[] links = {
            "https://example.com",
            "https://example.com/about",
            "https://example.com/contact",
            "https://example.com/blog",
            "https://example.com/login",
            "https://example.com/signup",
            "https://example.com/help",
            "https://example.com/faq",
            "https://example.com/terms",
            "https://example.com/privacy"
        };

        for (String link : links) {
            checkLink(link);
        }
    }

    public static void checkLink(String link) {
        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();

            int statusCode = connection.getResponseCode();

            if (statusCode == 200) {
                System.out.println("✅ " + link + " is working");
            } else {
                System.out.println("⚠️ " + link + " returned: " + statusCode);
            }

        } catch (Exception e) {
            System.out.println("❌ " + link + " failed: " + e.getMessage());
        }
    }

}
