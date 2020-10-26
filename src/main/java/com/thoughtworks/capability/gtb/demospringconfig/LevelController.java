package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LevelController {

    private int levelNumber;

    public LevelController(@Value("${levelNumber}") int levelNumber) {
        this.levelNumber = levelNumber;
    }

    @GetMapping("/level")
    public String getLevel() {
        System.out.println(levelNumber);
        return levelNumber < 1 ? "basic" : "advanced";
    }
}
