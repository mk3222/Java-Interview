import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

class WebWordExtractorFromWebPage {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://printwiki.org/Dummy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            sb.append(line).append(" ");
        }

        reader.close();

        // Strip HTML tags (basic)
        String text = sb.toString().replaceAll("<[^>]*>", " ");

        // Extract words
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }

        System.out.println("Words found: " + words);
    }
}
