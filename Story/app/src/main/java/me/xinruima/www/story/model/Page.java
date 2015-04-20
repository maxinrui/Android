package me.xinruima.www.story.model;

import android.widget.ImageView;

/**
 * Created by xma on 4/20/15.
 */
public class Page {

    private String mText;
    private int mImageId;
    private Choice mChoice1;
    private Choice mChoice2;

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }
}
