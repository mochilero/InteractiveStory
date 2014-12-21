package ch.trebol.interactivestory.model;

/**
 * Created by Andreas on 17.12.2014.
 */
public class Choice{
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int pageId) {
        mNextPage = pageId;
    }
}
