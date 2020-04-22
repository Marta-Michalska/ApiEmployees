import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpService {

    public String connect(String url) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
