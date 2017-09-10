package com.plusonetesting.RPSx;

import org.junit.Test;

import static org.apache.commons.lang3.EnumUtils.isValidEnum;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ComputerPlayerTest {

    @Test
    public void shouldNameComputerPlayerHal9KAndAssignValidWeapon() {
        ComputerPlayer computerPlayer = new ComputerPlayer();

        assertThat(isValidEnum(Weapon.class, computerPlayer.getWeapon().toString()), is(true));
        assertThat(computerPlayer.getName(),is(equalTo("HAL-9K")));
    }
}