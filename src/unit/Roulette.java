package unit;

import java.util.Random;

public class Roulette {

    private Sector currenSector;

    public Roulette() {
        currenSector = new Sector((byte)0);
    }

    private byte generateSectorNumber() {
        Random rand = new Random();
        return (byte)rand.nextInt(Sector.MAX_NUMBER);
    }

    public String spin() {
        currenSector.setNumber(this.generateSectorNumber());
        return currenSector.toString();
    }

}
