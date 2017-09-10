package com.plusonetesting.RPSx;

import java.util.Random;

class ComputerPlayer extends Player {

    private static final Random RANDOM = new Random();

    ComputerPlayer() {
        super("HAL-9K");

        setRandomWeapon();
    }

    private void setRandomWeapon() {
        this.setWeapon(Weapon.values()[RANDOM.nextInt(Weapon.values().length)]);
    }
}
