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
    public void paperShouldLoseToScissors() {
        assertThat(evaluate("Paper", "Scissors"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void paperShouldBeatSpock() {
        assertThat(evaluate("Paper", "Spock"), is(equalTo("You WIN!!")));
    }

    @Test
    public void paperShouldLoseToLizard() {
        assertThat(evaluate("Paper", "Lizard"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void scissorsShouldLoseToSpock() {
        assertThat(evaluate("Scissors", "Spock"), is(equalTo("You LOSE!!")));
    }

    @Test
    public void scissorsShouldBeatLizard() {
        assertThat(evaluate("Scissors", "Lizard"), is(equalTo("You WIN!!")));
    }

    @Test
    public void spockShouldLoseToLizard() {
        assertThat(evaluate("Spock", "Lizard"), is(equalTo("You LOSE!!")));
    }

}