import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnalyticsService service = new AnalyticsService();

        while(true){

            System.out.println("\n==== URL ANALYTICS TRACKER ====");
            System.out.println("1. Visit URL");
            System.out.println("2. Show Analytics");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    service.visitUrl(url);
                    break;

                case 2:
                    AnalyticsReport.generate(service.getRepository());
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
