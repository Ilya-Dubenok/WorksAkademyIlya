package additional.flowers;

public class Hrizantema implements IFlower{


    private int daysToLive;

    public Hrizantema(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    @Override
    public boolean isOld() {
        return daysToLive<=0;
    }
}
