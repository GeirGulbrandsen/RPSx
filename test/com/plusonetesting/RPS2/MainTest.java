package com.plusonetesting.RPS2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void canWeStartANewGame(){
        Game game = new Game();
        assertEquals((new Game()).getClass(), game.getClass());
    }

    @Test
    public void canWeReadAplayersName() {
        Player player = new Player("Player1", "Rock");
        assertEquals("Player1", player.getName());
    }

    @Test
    public void gameHasTwoPlayers() {
        Game game = new Game();
        assertEquals("Rock", game.player1.getAttack());
        assertEquals("Paper", game.player2.getAttack());
    }

    @Test
    public void evaluateWinner() {
        Game game = new Game();
        String result = game.evaluateWinner();
        assertEquals("Player2", result);
    }
}