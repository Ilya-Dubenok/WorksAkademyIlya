package additional.flowers;

public class Tulpan implements IFlower{

    private int daysToLive;

    public Tulpan(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    @Override
    public boolean isOld() {
        return daysToLive<=0;
    }
}
