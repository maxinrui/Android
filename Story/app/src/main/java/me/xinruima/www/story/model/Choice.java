package me.xinruima.www.story.model;

/**
 * Created by xma on 4/20/15.
 */
public class Choice {
    private String mText;

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    private int mNextPage;

    public Choice(String text, int mNextPage) {
        this.mText = text;
        this.mNextPage = mNextPage;
    }
}
