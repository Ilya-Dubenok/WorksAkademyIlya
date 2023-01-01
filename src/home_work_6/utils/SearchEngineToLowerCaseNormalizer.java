package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class SearchEngineToLowerCaseNormalizer implements ISearchEngine {

    private  ISearchEngine searchEngine;

    public SearchEngineToLowerCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public void setSearchEngine(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return ((RegExSearch) searchEngine).search(text, word, true);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }



}
