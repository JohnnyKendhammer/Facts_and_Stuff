package com.kendhammer.john.factsandstuff.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.kendhammer.john.factsandstuff.R;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnClickListenerAction {
    private FragmentManager manager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Loads the Home Fragment
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fragment, new HomeFragment()).addToBackStack(null).commit();

    }

    @Override
    public void loadQuotes() {

    }

    @Override
    public void loadJokes() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fragment, new JokeFragment()).addToBackStack(null).commit();
    }

    @Override
    public void loadFacts() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fragment, new FactFragment()).addToBackStack(null).commit();
    }

    @Override
    public void loadAffirmations() {

    }
}
