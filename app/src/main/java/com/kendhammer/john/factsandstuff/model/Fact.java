package com.kendhammer.john.factsandstuff.model;

public class Fact {
    private String fact;
    private String description;

    public Fact(String fact, String description) {
        this.fact = fact;
        this.description = description;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
