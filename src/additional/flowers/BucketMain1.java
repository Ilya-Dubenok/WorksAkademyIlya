package additional.flowers;

public class BucketMain1 {
    public static void main(String[] args) {

        Bucket bucket = new Bucket(
                new IFlower[]{new Rose(5), new Hrizantema(3),new Tulpan(0)});
        System.out.println(bucket.hasOldFlower());

        Bucket bucket2 = new Bucket(
                new IFlower[]{new Rose(5), new Hrizantema(3),new Tulpan(9)});
        System.out.println(bucket2.hasOldFlower());


    }

}
