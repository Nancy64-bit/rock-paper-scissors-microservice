package com.github.Nancy64bit.rockpaperscissorsservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private static final Logger logger = LoggerFactory.getLogger(GameService.class);

    private final RandomMoveService randomMoveService;

    @Autowired
    public GameService(RandomMoveService randomMoveService) {
        this.randomMoveService = randomMoveService;
    }

    public String calculateResult(String playerMove) {
        // Generate computer's move
        String computerMove = randomMoveService.generateRandomMove();

        // Log player's and computer's moves
        logger.info("Player's move: {}", playerMove);
        logger.info("Computer's move: {}", computerMove);

        // Compare player's move with computer's move and determine the result
        if (playerMove.equals(computerMove)) {
            logger.info("Game result: It is a tie");
            return "It is a tie";
        } else if ((playerMove.equals("rock") && computerMove.equals("scissors"))
                || (playerMove.equals("paper") && computerMove.equals("rock"))
                || (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            logger.info("Game result: Player wins");
            return "Player wins";
        } else {
            logger.info("Game result: Computer wins");
            return "Computer wins";
        }
    }
}
