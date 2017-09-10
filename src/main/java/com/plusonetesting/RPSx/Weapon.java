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
     * @param player1Weapon String
     * @param player2Weapon String
     * @return Does player1Weapon beat player2Weapon? true/false
     */
    static String evaluate(String player1Weapon, String player2Weapon) {

        if (valueOf(player1Weapon.toUpperCase()).getNumVal() == valueOf(player2Weapon.toUpperCase()).getNumVal()) {
            return "It's a tie.";
        } else {
            int d = numberOfWeapons + valueOf(player1Weapon.toUpperCase()).getNumVal() - valueOf(player2Weapon.toUpperCase()).getNumVal();
            if (((d % numberOfWeapons) % 2) == 1) {
                return "You WIN!!";
            } else {
                return "You LOSE!!";
            }
        }
    }
}
