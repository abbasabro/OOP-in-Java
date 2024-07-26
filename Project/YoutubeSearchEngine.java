
public class YoutubeSearchEngine extends SearchEngine{
	YoutubeSearchEngine() {
	        super("Youtube");
	    }

	    @Override
	    public void openWebPage(String query) {
	        String url = "https://www.youtube.com/results?search_query=" + query;
	        super.openWebPage(url);
	    }
}

