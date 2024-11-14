package Nov.ex_14112024_Static_wrapper_exceptions;

public enum APIendpoints {

    google("www.google.com"),
    youtube("www.youtube.com"),
    flipkart("www.flipkart.com"),
    amazon("www.amazon.com"),
    ebay("www.ebay.com");


    private String name;
    APIendpoints(String name){
        this.name = name;
    }
    public String getValue(){
        return name;
    }
}
