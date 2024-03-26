package unit.roullete;

public class Sector {
    private String color;
    private byte number;

    public static final byte MAX_NUMBER = 36;
    private static final String BLACK_COLOR = "black";
    private static final String RED_COLOR = "red";
    private static final String GREEN_COLOR = "green";

    public Sector(byte number) {
        this.setNumber(number);
    }

    public void setNumber(byte number) {
        this.number = number;
        this.color = getColor(number);
    }

    public byte getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public void generateNew() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sector is ");
        sb.append(this.getColor());
        sb.append(", number is ");
        sb.append(this.getNumber());
        return sb.toString();
    }

    private String getColor(int number) {
        if(isGreen(number))
            return GREEN_COLOR;
        else if(isRed(number))
            return RED_COLOR;
        else
            return BLACK_COLOR;
    }

    private boolean isGreen(int number) {
        return number == 0;
    }

    private boolean isRed(int number) {
        return (number % 2) == 0;
    }
}
