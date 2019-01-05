package com.ry.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    private static final String TAG = DisplayJokeActivity.class.getSimpleName();
    private TextView jokeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        jokeTV = findViewById(R.id.tv_joke);

//        if there is data in extra intent
        if (getIntent().getExtras() != null) {
            String joke = getIntent().getExtras().getString("joke");
            Log.e(TAG, "onCreate: joke=" + joke);

            jokeTV.setText(joke);
        }
    }
}
