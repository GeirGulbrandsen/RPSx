package com.plusonetesting.RPSx;

public class RPSx {

    public static void main(String[] args) {

    }

    public enum Weapon {
        ROCK(0),
        PAPER(1),
        SCISSORS(2);

        private int numVal;

        Weapon(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }
    }

    static boolean evaluate(String player1Weapon, String player2Weapon) {

        return Weapon.valueOf(player1Weapon.toUpperCase()).getNumVal() < Weapon.valueOf(player2Weapon.toUpperCase()).getNumVal();
    }
}
