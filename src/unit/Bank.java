package unit;

public class Bank {
    private int money;

    public Bank(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int giveMoney(int money) {
        int givedMoney = 0;

        if(isEnough(money))
            givedMoney = money;

        removeMoney(money);

        return givedMoney;
    }

    public void recieveMoney(int money) {
        this.money += money;
    }

    private boolean isEnough(int money) {
        return money <= this.getMoney();
    }

    private void removeMoney(int money) {
        this.money -= money;
    }
}
