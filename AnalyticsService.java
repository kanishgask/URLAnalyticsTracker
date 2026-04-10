public class AnalyticsService {

    private UrlRepository repository;

    public AnalyticsService(){
        repository = new UrlRepository();
    }

    public void visitUrl(String url){

        UrlVisit visit = repository.findUrl(url);

        if(visit == null){
            repository.addUrl(new UrlVisit(url));
        }else{
            visit.increment();
        }

        System.out.println("Visit recorded.");
    }

    public UrlRepository getRepository(){
        return repository;
    }
}
