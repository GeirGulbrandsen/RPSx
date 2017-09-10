package com.plusonetesting.RPSx;

public enum Weapon {
    ROCK(0),
    PAPER(1),
    SCISSORS(2),
    SPOCK(3),
    LIZARD(4);

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

        int weapon1 = valueOf(player1Weapon.toUpperCase()).getNumVal();
        int weapon2 = valueOf(player2Weapon.toUpperCase()).getNumVal();

        if (weapon1 == weapon2) {
            return "It's a tie.";
        } else {
            int d = numberOfWeapons + weapon1 - weapon2;
            if (((d % numberOfWeapons) % 2) == 1) {
                return "You WIN!!";
            } else {
                return "You LOSE!!";
            }
        }
    }
}
