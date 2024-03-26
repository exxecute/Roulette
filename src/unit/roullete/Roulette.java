package unit.roullete;

import unit.player.Bet;
import unit.player.Player;

import java.util.Random;

public class Roulette {

    private Sector currenSector;
    private Player[] players = new Player[MAX_PLAYERS];
    private Bet[] bets = new Bet[MAX_PLAYERS];
    private int playersAmount = 0;
    private static final byte MAX_PLAYERS = 10;

    public Roulette() {
        currenSector = new Sector((byte)0);
    }

    private byte generateSectorNumber() {
        Random rand = new Random();
        return (byte)rand.nextInt(Sector.MAX_NUMBER);
    }

    public Sector spin() {
        currenSector.setNumber(this.generateSectorNumber());
        return currenSector;
    }

    public void addPlayer(Player newPlayer) {
        players[playersAmount] = newPlayer;
        playersAmount++;
    }

    public int playTable() {
        int moneyWin = 0;
        for(int i = 0; i < this.playersAmount; i++) {
            bets[i] = this.players[i].setRandomBet();
        }

        spin();

        for(int i = 0; i < this.playersAmount; i++) {
            if(this.bets[i].isWin(currenSector)) {
                moneyWin += this.bets[i].getMoney();
                this.printGame(players[i], this.bets[i].getMoney(), false);
            } else {
                int moneyLose = this.bets[i].getMoney() * 2;
                moneyWin -= moneyLose;
                players[i].getPocket().giveMoney(moneyLose);
                this.printGame(players[i], moneyLose, true);
            }
        }

        return moneyWin;
    }

    private void printGame(Player player, int money, boolean win) {
        StringBuilder sb = new StringBuilder();
        sb.append(player.getName());
        if(win)
            sb.append(" wins ");
        else
            sb.append(" loses ");
        sb.append(money);

        System.out.println(sb.toString());
    }

}
