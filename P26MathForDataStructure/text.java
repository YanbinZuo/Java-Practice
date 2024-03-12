package P26MathForDataStructure;

import java.util.HashMap;
import java.util.Map;

public class URLParser {
    public static void parseURL(String url) {
        String domain = "";
        String path = "";
        Map<String, String> queryParams = new HashMap<>();
        String anchor = "";

        // Remove the protocol
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            url = url.substring(protocolEndIndex + 3);
        }

        // Extract the domain
        int pathStartIndex = url.indexOf("/");
        if (pathStartIndex != -1) {
            domain = url.substring(0, pathStartIndex);
            url = url.substring(pathStartIndex);
        } else {
            domain = url;
            url = "";
        }

        // Extract the anchor
        int anchorStartIndex = url.indexOf("#");
        if (anchorStartIndex != -1) {
            anchor = url.substring(anchorStartIndex + 1);
            url = url.substring(0, anchorStartIndex);
        }

        // Extract query parameters
        int queryStartIndex = url.indexOf("?");
        if (queryStartIndex != -1) {
            String[] queryParamsArray = url.substring(queryStartIndex + 1).split("&");
            for (String param : queryParamsArray) {
                String[] keyValue = param.split("=");
                if (keyValue.length == 2) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
            path = url.substring(0, queryStartIndex);
        } else {
            path = url;
        }

        // Print results
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
        System.out.println("Query Params: " + queryParams.toString());
        System.out.println("Anchor: " + anchor);
    }

    public static void main(String[] args) {
        String url = "https://www.bing.com/search?q=foobar&lang=us#hello";
        parseURL(url);
    }
}
