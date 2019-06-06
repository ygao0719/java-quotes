/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp_quotes() {
        try {
            Gson gson = new Gson();

            BufferedReader json = new BufferedReader(new FileReader("/Users/ayga/Desktop/code fellows/401/labs/java-quotes/src/main/resources/recentquotes.json"));
            Quote[] quote = gson.fromJson(json, Quote[].class);

            int random = (int) (Math.random() * quote.length);
            Quote output = quote[random];
            assertTrue(output.toString().contains(output.getAuthor()));
            assertTrue(output.toString().contains(output.getText()));
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
