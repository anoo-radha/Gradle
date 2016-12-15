package com.anuradha.joketelling;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.JokeSmith;
import com.example.JokeWizard;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_main, container, false);
        TextView jokeText = (TextView) v.findViewById(R.id.jokesmith_txt);
        TextView jokeText2 = (TextView) v.findViewById(R.id.jokewizard_txt);
        Button jokeButton =(Button)v.findViewById(R.id.joke_button);
        //display joke from jokesmith library
        JokeSmith myJokeSmith = new JokeSmith();
        String smithJoke = myJokeSmith.getJoke();
        jokeText.setText(smithJoke);
        //display joke from jokewizard library
        JokeWizard myJokeWizard = new JokeWizard();
        jokeText2.setText(myJokeWizard.getJoke());
        return v;
    }
}
