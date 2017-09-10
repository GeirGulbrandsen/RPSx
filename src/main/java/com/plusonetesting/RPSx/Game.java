package com.plusonetesting.RPSx;

class Game {

    Game() {

    }

    String evaluateFight(Player player1, Player player2) {
        return Weapon.evaluate(player1.getWeapon().toString(), player2.getWeapon().toString());
    }

}
