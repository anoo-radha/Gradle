package com.anuradha.jokeandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static final String JOKE_KEY ="joke_key";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display);
        Intent intent = this.getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeTextView = (TextView) findViewById(R.id.jokeandroidlibrary_txt);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

    }
}
