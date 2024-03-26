package unit.player;

import unit.roullete.Sector;

public class Bet {
    private int money;
    private Sector sector;

    public Bet(int money, Sector sector) {
        this.money = money;
        this.sector = sector;
    }

    public int getMoney() {
        return this.money;
    }

    public boolean isWin(Sector roulleteSector) {
        return sector.getColor().equals(roulleteSector.getColor());
    }
}
