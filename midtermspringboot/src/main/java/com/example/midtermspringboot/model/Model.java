package com.example.midtermspringboot.model;

import com.example.midtermspringboot.Entity.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class Model {

    private String joke;

    @Autowired
    private final RandomJokes randomJokes;


    public Model(RandomJokes randomJokes) {
        this.randomJokes = randomJokes;
        joke = randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Model{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
