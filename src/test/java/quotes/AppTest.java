/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.*;

public class AppTest {
    //test getting something from API
    @Test
    public void test_getQuote() {
    try {
            URL url = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            Gson gson = new Gson();
            Quote quoteFromApi = gson.fromJson(reader, Quote.class);

            assertNotNull(quoteFromApi.quoteText);
        }catch(IOException e){
            System.out.println(e);
        }

    }

    // test that proves quotes can be added to your file.
    public void test_IOFile() {
        try {
            Gson gson = new Gson();
            Quote quote = new Quote(,"harry","2 likes","If we expect to “know” the truth");
            FileWriter fileWriter = new FileWriter("./resources/test.json");
            gson.toJson(quoteList, fileWriter);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
//        App instanceForTest = new App();
//        try {
//
//            instanceForTest.getQuote();
//
//            Gson gson = new Gson();
//
//            BufferedReader json = new BufferedReader(new FileReader("./resources/recentquotes.json"));
//            Quote[] quote = gson.fromJson(json, Quote[].class);
//
//            assertEquals(quote[quote.length-1].quoteText,instanceForTest.getQuote());
//
//        }catch (FileNotFoundException e){
//            System.out.println(e);
//        }
