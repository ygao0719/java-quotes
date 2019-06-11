# Java-quotes
- The app shows the quote and the author when it is run. The app should 
choose one
quote each time it is run.
## Lab 9: 
1. make a request to an API to get a random quote. 
2. if your app has errors in connecting to the Internet, you instead display a random 
 quote from your file. 
3. When we grab a random quote from the Internet, we could add it to our 
file of quotes, for use if the app goes offline 
 in the future. 

### Gson
Gson is a Java library that can be used to convert Java Objects into 
their JSON representation. It can also be used to
convert a JSON string to an equivalent Java object. Gson can work with 
arbitrary Java objects including pre-existing
objects that you do not have source-code of.

### Download
    Gradle:
    dependencies {
      implementation 'com.google.code.gson:gson:2.8.5'
    }
    
    
    Maven:
    <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.8.5</version>
    </dependency>

### [MainCode](./src/main/java/quotes/App.java)
### [TestCode](./src/test/java/quotes/AppTest.java)
