public class UrlVisit {

    private String url;
    private int count;

    public UrlVisit(String url){
        this.url = url;
        this.count = 1;
    }

    public String getUrl(){
        return url;
    }

    public int getCount(){
        return count;
    }

    public void increment(){
        count++;
    }
}
