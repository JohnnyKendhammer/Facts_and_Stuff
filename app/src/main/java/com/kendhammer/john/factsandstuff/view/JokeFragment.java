package com.kendhammer.john.factsandstuff.view;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.kendhammer.john.factsandstuff.R;
import com.kendhammer.john.factsandstuff.model.Joke;
import com.kendhammer.john.factsandstuff.model.lists.ListOfJokes;

import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment {
    private TextView tvJoke;
    private ArrayList<String> jokes;

    public JokeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joke, container, false);
        tvJoke = view.findViewById(R.id.tv_joke);
        jokes = new ListOfJokes().getJokes();
        tvJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setJoke(tvJoke);
            }
        });
        setJoke(tvJoke);
        return view;
    }

    private void setJoke(TextView tvJoke) {
        Random rand = new Random();
        Joke joke = new Joke(jokes.get(rand.nextInt(jokes.size())));
        tvJoke.setBackgroundResource(joke.getBackgroundId());
        if (joke.getBackgroundId() == R.drawable.grunge_purple) {
            tvJoke.setTextColor(Color.BLACK);
        } else {
            tvJoke.setTextColor(Color.WHITE);
        }
        tvJoke.setText(joke.getJoke());
    }
}
