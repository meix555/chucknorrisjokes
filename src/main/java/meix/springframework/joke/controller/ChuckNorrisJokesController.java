package meix.springframework.joke.controller;

import meix.springframework.joke.service.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuckNorrisJokesController {

    private ChuckNorrisJokeService service;

    public ChuckNorrisJokesController(ChuckNorrisJokeService service) {
        this.service = service;
    }

    @GetMapping({"", "/", "/joke"})
    public String getJoke(Model model) {

        model.addAttribute("joke", service.getRandomJoke().getJoke());

        return "chucknorris";
    }

}
