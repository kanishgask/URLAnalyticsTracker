import java.util.ArrayList;
import java.util.List;

public class UrlRepository {

    private List<UrlVisit> urls;

    public UrlRepository(){
        urls = new ArrayList<>();
    }

    public void addUrl(UrlVisit url){
        urls.add(url);
    }

    public UrlVisit findUrl(String url){

        for(UrlVisit u : urls){

            if(u.getUrl().equalsIgnoreCase(url)){
                return u;
            }
        }

        return null;
    }

    public List<UrlVisit> getUrls(){
        return urls;
    }
}
