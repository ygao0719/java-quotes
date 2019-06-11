package quotes;


public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;
    String quoteText;

    public Quote(String[] tags, String author, String likes, String text,String quoteText){

        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
        this.quoteText = quoteText;

    }
    public String getAuthor(){
        return this.author;
    }

    public String getLikes(){
        return this.likes;
    }

    public String getText(){
        return this.text;
    }
    public String toString(){
        return String.format("The quote %s \n is written by %s",this.text,this.author);
    }

}
