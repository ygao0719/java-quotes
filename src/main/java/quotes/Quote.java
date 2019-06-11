package quotes;


public class Quote {
    String[] tags;
    String author;
    String likes;
    String quoteText;

    public Quote(String[] tags, String author, String likes, String text){

        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.quoteText = text;
    }
    public String getAuthor(){
        return this.author;
    }

    public String getLikes(){
        return this.likes;
    }

    public String getText(){
        return this.quoteText;
    }
    public String toString(){
        return String.format("The quote %s \n is written by %s",this.quoteText,this.author);
    }

}
