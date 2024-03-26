package unit;

import unit.player.Player;
import unit.roullete.Roulette;

public class Casino {
    private Roulette roulette;
    private Bank casinoMoney;

    public Casino(Player[] players, int casinoMoney) {
        this.roulette = new Roulette();

        for(int i = 0; i < players.length; i++) {
            this.roulette.addPlayer(players[i]);
        }

        this.casinoMoney = new Bank(casinoMoney);
    }

    public boolean play() {
        this.roulette.playTable();
        return false;
    }
}
