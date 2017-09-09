package com.plusonetesting.RPSx;

import org.junit.Test;

import static com.plusonetesting.RPSx.RPSx.evaluate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RPSxTest {

    @Test
    public void rockShouldBeatScissors() {
        assertThat(evaluate("Rock", "Scissors"),is(true));
    }

    @Test
    public void ScissorsShouldLoseToRock() {
        assertThat(evaluate("Scissors", "Rock"),is(false));
    }
}