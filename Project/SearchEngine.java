import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class SearchEngine {
    private String name;
    private String url;
    private SearchHistory searchHistory;

    SearchEngine(String name) {
        this.name = name;
        this.searchHistory = new SearchHistory();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void openWebPage(String url) {
        url = url.replace(" ", "+");
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(new URI(url));
                    searchHistory.addToSearchHistory(url);
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Opening web pages is not supported on this platform.");
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }

    public ArrayList<String> getSearchHistory() {
        return searchHistory.getSearchHistory();
    }

    // Inner class SearchHistory
    private class SearchHistory {
        private ArrayList<String> searchHistory;

        public SearchHistory() {
            this.searchHistory = new ArrayList<>();
        }

        public void addToSearchHistory(String query) {
            searchHistory.add(query);
        }

        public ArrayList<String> getSearchHistory() {
            return searchHistory;
        }
    }
}
