package additional.flowers;

public class Bucket {

    private IFlower[] items;

    public Bucket(IFlower[] items) {
        this.items = items;
    }

    /**
     * Проверяет, есть ли в букете завядший цветок
     * @return
     */
    public boolean hasOldFlower() {
        boolean result = false;
        for (IFlower item : items) {
            if (item.isOld()) {
                return true;
            }
        }

        return result;
    }
}
