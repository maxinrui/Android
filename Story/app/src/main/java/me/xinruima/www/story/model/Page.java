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
    private  boolean mIsFinal = false;

    public Page (int imageId, String text, Choice choice1, Choice choice2) {
        this.mText = text;
        this.mImageId = imageId;
        this.mChoice1 = choice1;
        this.mChoice2 = choice2;
    }

    public Page (int mImageId, String mText) {
        this.mImageId = mImageId;
        this.mText = mText;
        this.mChoice1 = null;
        this.mChoice2 = null;
        this.mIsFinal = true;
    }

    public boolean getIsFinal () {
        return mIsFinal;
    }

    public void setIsFinal(boolean value) {
        this.mIsFinal = value;
    }

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
