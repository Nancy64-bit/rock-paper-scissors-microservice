package com.github.Nancy64bit.rockpaperscissorsservice;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomMoveService {

    private static final String[] MOVES = {"rock", "paper", "scissors"};
    private static final Random RANDOM = new Random();

    public String generateRandomMove() {
        int index = RANDOM.nextInt(MOVES.length);
        return MOVES[index];
    }
}

