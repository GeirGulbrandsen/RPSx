package com.plusonetesting.RPSx;

public enum Weapon {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private int numVal;
    private static int numberOfWeapons = Weapon.values().length;

    Weapon(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    /**
     *
     * @param player1Weapon String
     * @param player2Weapon String
     * @return Does player1Weapon beat player2Weapon? true/false
     */
     static boolean evaluate(String player1Weapon, String player2Weapon) {

         int d = numberOfWeapons + valueOf(player1Weapon.toUpperCase()).getNumVal() - valueOf(player2Weapon.toUpperCase()).getNumVal();

        return ((d % numberOfWeapons) % 2) == 1;
     }
}
