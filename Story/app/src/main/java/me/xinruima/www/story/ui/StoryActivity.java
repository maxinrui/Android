package me.xinruima.www.story.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.xinruima.www.story.R;
import me.xinruima.www.story.model.Page;
import me.xinruima.www.story.model.Story;


public class StoryActivity extends Activity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();
    private TextView mTextView;
    private ImageView mImageView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName;
    private Page currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));

        if (mName == null) {
            mName = "Friend";
        }

        mTextView = (TextView)findViewById(R.id.storyTextView);
        mImageView = (ImageView)findViewById(R.id.storyImageView);
        mChoice1 = (Button)findViewById(R.id.choiceButton1);
        mChoice2 = (Button)findViewById(R.id.choiceButton2);

        loadPage(0);

    }

    private void loadPage(int choice) {

        currentPage = mStory.getPage(choice);

        Drawable drawable = getResources().getDrawable(currentPage.getImageId());
        mImageView.setImageDrawable(drawable);

        // Add the name if placeholder included
        String pageText = currentPage.getText();
        pageText = String.format(pageText, mName);
        mTextView.setText(pageText);

        if (currentPage.getIsFinal()) {
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("Play again");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        } else {
            mChoice1.setText(currentPage.getChoice1().getText());
            mChoice2.setText(currentPage.getChoice2().getText());

            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = currentPage.getChoice1().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = currentPage.getChoice2().getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }
}
