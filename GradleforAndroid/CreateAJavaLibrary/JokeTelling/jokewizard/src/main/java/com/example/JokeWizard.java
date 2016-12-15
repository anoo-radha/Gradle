package com.example;

public class JokeWizard {

    public String getJoke(){
        JokeSmith jokeSmith = new JokeSmith();
        return jokeSmith.getJoke();
    }
}
