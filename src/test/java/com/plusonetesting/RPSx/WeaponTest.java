package com.plusonetesting.RPSx;

import org.junit.Test;

import static com.plusonetesting.RPSx.Weapon.evaluate;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeaponTest {

    @Test
    public void rockShouldTieWithRock() {
        assertThat(evaluate("Rock", "Rock"), is(equalTo("It's a tie.")));
    }

    @Test
    public void rockShouldLoseToPaper() {
        assertThat(evaluate("Rock", "Paper"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void rockShouldBeatScissors() {
        assertThat(evaluate("Rock", "Scissors"), is(equalTo("You WIN!!")));
    }

    @Test
    public void rockShouldLoseToSpock() {
        assertThat(evaluate("Rock", "Spock"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void rockShouldBeatLizard() {
        assertThat(evaluate("Rock", "Lizard"), is(equalTo("You WIN!!")));
    }

    @Test
    public void scissorsShouldBeatPaper() {
        assertThat(evaluate("Rock", "Scissors"), is(equalTo("You WIN!!")));
    }

    @Test
    public void scissorsShouldLoseToRock() {
        assertThat(evaluate("Scissors", "Rock"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void paperShouldBeatRock() {
        assertThat(evaluate("Rock", "Scissors"), is(equalTo("You WIN!!")));
    }

    @Test
    public void scissorsShouldLoseToScissors() {
        assertThat(evaluate("Scissors", "Rock"), is(equalTo("You LOSE!!")));
    }
}