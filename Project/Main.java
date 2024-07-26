import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SearchEngine google = new GoogleSearchEngine();
        SearchEngine bing = new BingSearchEngine();
        SearchEngine youtube = new YoutubeSearchEngine();
        int option;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Search");
            System.out.println("2. View History");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Website (Google/Youtube/Bing): ");
                    String website = s.next().toLowerCase();
                    System.out.print("Search: ");
                    String search = s.nextLine(); // Consume the newline character
                    search = s.nextLine(); // Read the actual search query
                    if (website.equals("google")) {
                        google.openWebPage(search);
                    } else if (website.equals("youtube")) {
                        youtube.openWebPage(search);
                    } else if (website.equals("bing")) {
                        bing.openWebPage(search);
                    } else {
                        System.out.println("Website not recognized");
                    }
                    break;

                case 2:
                    System.out.print("Enter Website (Google/Youtube/Bing): ");
                    String websiteName = s.next().toLowerCase();
                    if (websiteName.equals("google")) {
                        System.out.println("Google Search History:");
                        for (String query : google.getSearchHistory()) {
                            System.out.println(query);
                        }
                    } else if (websiteName.equals("youtube")) {
                        System.out.println("Youtube Search History:");
                        for (String query : youtube.getSearchHistory()) {
                            System.out.println(query);
                        }
                    } else if (websiteName.equals("bing")) {
                        System.out.println("Bing Search History:");
                        for (String query : bing.getSearchHistory()) {
                            System.out.println(query);
                        }
                    } else {
                        System.out.println("Website not recognized");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 3.");
            }
        } while (option != 3);

        s.close(); 
    }
}
