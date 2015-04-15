package me.xinruima.www.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private ColorPanel mColorPanel = new ColorPanel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // declare our view variables
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout mLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the fact label with new fact
                String fact = "";

                fact = mFactBook.getFact();

                factLabel.setText(fact);
                mLayout.setBackgroundColor(mColorPanel.getColor());
                showFactButton.setTextColor(mColorPanel.getColor());
            }
        };
        showFactButton.setOnClickListener(listener);

        Toast.makeText(this,"Xinrui is really Handsome!",Toast.LENGTH_LONG).show();

    }

}
