package additional.flowers;

public class Rose implements IFlower{

    private int daysToLive;

    public Rose(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    @Override
    public boolean isOld() {
        return daysToLive<=0;
    }
}
