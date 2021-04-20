package meix.springframework.joke.service;

import meix.springframework.joke.dbaccess.JokeRepository;
import meix.springframework.joke.model.ChuckNorrisJoke;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ChuckNorrisJokeService {

    private final JokeRepository jokeRepository;

    private List<ChuckNorrisJoke> allJokes;

    private Random random;

    public ChuckNorrisJokeService(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
        this.allJokes = (List<ChuckNorrisJoke>) jokeRepository.findAll();
        this.random = new Random();
    }

    public ChuckNorrisJoke getRandomJoke() {
        return allJokes.get(random.nextInt(allJokes.size()));
    }
}
