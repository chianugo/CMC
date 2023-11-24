package helloworld;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class ParseCurrencies {

    private static String apiKey = "66eb8dff-9944-4b5e-b19e-8b966bf023e6";

    public static void main(String[] args) {
        String uri = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
        String uri2 = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/map";
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("start", "1"));
        parameters.add(new BasicNameValuePair("limit", "5000"));
        parameters.add(new BasicNameValuePair("convert", "USD"));

        String result = "";
//        errors creating servers with mysql
        String db_url = "";
        String username = "root";
        String password = "sql";

        try {
            result = makeAPICall(uri, parameters);
            String map = makeAPICall(uri2, parameters);
            System.out.println("the map is " + map);
        } catch (IOException e) {
            System.out.println("Error: cannot access content - " + e.toString());
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URL " + e.toString());
        }

        if (!result.isEmpty()) {
            System.out.println(result);
            ObjectMapper objectMapper = new ObjectMapper();


            try {
                // Convert JSON string to Java object
                // Data data = objectMapper.readValue(result, Data.class);

                JsonNode rootNode = objectMapper.readTree(result);
                JsonNode dataArray = rootNode.get("data");

                if (dataArray.isArray()) {
                    ArrayNode data = (ArrayNode) dataArray;
                    for (JsonNode node : data) {
                        // Access each object inside the "data" array
                        System.out.println("ID: " + node.get("id").asText());
                        System.out.println("Name: " + node.get("name").asText());
                        System.out.println("Symbol: " + node.get("symbol").asText());
                        System.out.println("Slug: " + node.get("slug").asText() + "\n");
                        // Access other fields as needed
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    public static String makeAPICall(String uri, List<NameValuePair> parameters)
            throws URISyntaxException, IOException {
        String response_content = "";

        URIBuilder query = new URIBuilder(uri);
        query.addParameters(parameters);

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(query.build());

        request.setHeader(HttpHeaders.ACCEPT, "application/json");
        request.addHeader("X-CMC_PRO_API_KEY", apiKey);

        CloseableHttpResponse response = client.execute(request);

        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            response_content = EntityUtils.toString(entity);
            EntityUtils.consume(entity);
        } finally {
            response.close();
        }

        return response_content;
    }
}
