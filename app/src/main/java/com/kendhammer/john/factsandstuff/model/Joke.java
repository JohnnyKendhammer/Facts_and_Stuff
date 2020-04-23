package com.kendhammer.john.factsandstuff.model;

import com.kendhammer.john.factsandstuff.R;

import java.util.Random;

public class Joke {
    private int backgroundId;
    private String joke;

    public Joke(String joke){
        this.joke = joke;
        this.backgroundId = getRandomBackground();
    }


    private int getRandomBackground() {
        int backgroundId = R.drawable.desert_background;
        Random r = new Random();
        int x = r.nextInt(3) + 1;
        switch (x) {
            case 1:
                backgroundId = R.drawable.feather;
                break;
            case 2:
                backgroundId = R.drawable.grunge_purple;
                break;
            case 3:
                backgroundId = R.drawable.after_effects;
        }
        return backgroundId;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
