package com.plusonetesting.RPSx;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void canWeCreateAGameWithTwoPlayersArmThemAndEvaluateTheFight() {
        Game game = new Game();
        Player player1 = new Player("Hal-1000");
        Player player2 = new Player("Hal-9000");

        player1.setWeapon(Weapon.PAPER);
        player2.setWeapon(Weapon.ROCK);

        assertThat(game.evaluateFight(player1, player2), is(equalTo("You WIN!!")));
    }
}