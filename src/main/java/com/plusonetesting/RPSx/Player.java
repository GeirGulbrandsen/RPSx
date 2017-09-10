package com.plusonetesting.RPSx;

class Player {

    private final String name;
    private Weapon weapon;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Weapon getWeapon() {
        return weapon;
    }
}
