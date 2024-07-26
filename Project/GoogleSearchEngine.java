
public class GoogleSearchEngine extends SearchEngine {
    GoogleSearchEngine() {
        super("Google");
    }

    @Override
    public void openWebPage(String query) {
        String url = "https://www.google.com/search?q=" + query;
        super.openWebPage(url);
    }
}


