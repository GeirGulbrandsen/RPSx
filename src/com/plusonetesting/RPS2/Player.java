package com.plusonetesting.RPS2;

class Player {

    private String name;
    private String attack;

    Player(String name, String attack) {
        this.name = name;
        this.attack = attack;
    }

    String getName() {
        return name;
    }

    String getAttack() {
        return attack;
    }
};