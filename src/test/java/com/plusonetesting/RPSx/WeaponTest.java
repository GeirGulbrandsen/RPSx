package com.plusonetesting.RPSx;

import org.junit.Test;

import static com.plusonetesting.RPSx.Weapon.evaluate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WeaponTest {

    @Test
    public void rockShouldBeatScissors() {
        assertThat(evaluate("Rock", "Scissors"), is(true));
    }

    @Test
    public void rockShouldLoseToPaper() {
        assertThat(evaluate("Rock", "Paper"), is(false));
    }

    @Test
    public void scissorsShouldBeatPaper() {
        assertThat(evaluate("Rock", "Scissors"), is(true));
    }

    @Test
    public void scissorsShouldLoseToRock() {
        assertThat(evaluate("Scissors", "Rock"), is(false));
    }

    @Test
    public void paperShouldBeatRock() {
        assertThat(evaluate("Rock", "Scissors"), is(true));
    }

    @Test
    public void scissorsShouldLoseToScissors() {
        assertThat(evaluate("Scissors", "Rock"), is(false));
    }
}