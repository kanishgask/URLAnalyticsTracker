public class AnalyticsReport {

    public static void generate(UrlRepository repo){

        int totalVisits = 0;
        UrlVisit mostVisited = null;

        for(UrlVisit u : repo.getUrls()){

            totalVisits += u.getCount();

            if(mostVisited == null || u.getCount() > mostVisited.getCount()){
                mostVisited = u;
            }
        }

        System.out.println("Total Unique URLs: " + repo.getUrls().size());
        System.out.println("Total Visits: " + totalVisits);

        if(mostVisited != null){
            System.out.println("Most Visited URL: " + mostVisited.getUrl() +
                               " (" + mostVisited.getCount() + " visits)");
        }
    }
}
