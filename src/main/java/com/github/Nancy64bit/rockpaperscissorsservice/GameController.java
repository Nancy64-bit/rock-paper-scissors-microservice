package com.github.Nancy64bit.rockpaperscissorsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/play")
    public ResponseEntity<PlayResponse> playGame(@RequestBody PlayRequest playRequest) {
        // Calculate game result
        String result = gameService.calculateResult(playRequest.getMove());
        
        // Create PlayResponse object with the result
        PlayResponse playResponse = new PlayResponse();
        playResponse.setResult(result);

        // Return the response with HTTP status 200
        return ResponseEntity.ok(playResponse);
    }
}
