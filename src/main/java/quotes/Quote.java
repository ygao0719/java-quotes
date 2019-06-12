package quotes;


public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;
    String quoteText;

    public Quote(String[] tags, String author, String likes, String text){

        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;

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
