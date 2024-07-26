public class BingSearchEngine extends SearchEngine {
    BingSearchEngine() {
        super("Bing");
    }

    @Override
    public void openWebPage(String query) {
        String url = "https://www.bing.com/search?q=" + query;
        super.openWebPage(url);
    }
}
