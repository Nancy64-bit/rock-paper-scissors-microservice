// package com.github.Nancy64bit.rockpaperscissorsservice;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.mock;
// import static org.mockito.Mockito.when;

// public class GameServiceTest {

//     @Test
//     public void testCalculateResult_PlayerWins() {
//         RandomMoveService randomMoveService = mock(RandomMoveService.class);
//         when(randomMoveService.generateRandomMove()).thenReturn("scissors");

//         GameService gameService = new GameService(randomMoveService);

//         // Test scenario where player wins (rock beats scissors)
//         assertEquals("Player wins", gameService.calculateResult("rock"));
//     }

//     @Test
//     public void testCalculateResult_Tie() {
//         RandomMoveService randomMoveService = mock(RandomMoveService.class);
//         when(randomMoveService.generateRandomMove()).thenReturn("rock");

//         GameService gameService = new GameService(randomMoveService);

//         // Test scenario where it's a tie (both choose rock)
//         assertEquals("It is a tie", gameService.calculateResult("rock"));
//     }

//     @Test
//     public void testCalculateResult_ComputerWins() {
//         RandomMoveService randomMoveService = mock(RandomMoveService.class);
//         when(randomMoveService.generateRandomMove()).thenReturn("rock");

//         GameService gameService = new GameService(randomMoveService);

//         // Test scenario where computer wins (paper beats rock)
//         assertEquals("Computer wins", gameService.calculateResult("paper"));
//     }
// }
