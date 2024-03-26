package unit.player;

import unit.Bank;
import unit.roullete.Sector;

import java.util.Random;

public class Player {
    Bank pocket;
    String name;

    public Player(int money, String name) {
        this.pocket = new Bank(money);
        this.name = name;
    }

    public int generateBet() {
        Random rand = new Random(pocket.getMoney());
        return rand.nextInt();
    }

    public Bet setBet(int money) {
        return new Bet(pocket.giveMoney(money), new Sector((byte)this.generateSector()));
    }

    public Bet setRandomBet() {
        return this.setBet(this.generateBet());
    }

    public int generateSector() {
        Random rand = new Random(Sector.MAX_NUMBER);
        return rand.nextInt();
    }

    public Bank getPocket() {
        return this.pocket;
    }

    public String getName() {
        return this.name;
    }
}
