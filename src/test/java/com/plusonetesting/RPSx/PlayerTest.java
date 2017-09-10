package com.plusonetesting.RPSx;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    @Test
    public void canWeCreateAPlayer() {
        Player player = new Player("Hal");

        assertThat(player.getName(), is(equalTo("Hal")));
    }

    @Test
    public void canPlayerGetWeapon() {
        Player player = new Player("Hal");

        player.setWeapon(Weapon.ROCK);

        assertThat(player.getWeapon(), is(Weapon.ROCK));
    }
}