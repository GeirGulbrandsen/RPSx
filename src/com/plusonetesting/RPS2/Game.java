package com.plusonetesting.RPS2;

class Game {

    Player player1;
    Player player2;

    Game() {
        player1 = new Player("Player1", "Rock");
        player2 = new Player("Player2", "Paper");
    }

    String evaluateWinner() {
        if (player1.getAttack().equals("Rock") && player2.getAttack().equals("Paper"))
            return player2.getName();
        else
            return player1.getName();
    }
}
