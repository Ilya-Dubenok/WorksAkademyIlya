package home_work_1;

public class Task7 {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,7,8,4,1,2,0};
        System.out.println(phoneBuilder(a));//очень тупой, но работающий метод
        System.out.println(phoneBuilder2(a));//чуть удобнее для редактирования

    }


    public static String phoneBuilder (int [] nums) {
        return "("+nums[0]+""+nums[1]+""+nums[2]+") "+nums[3]+""+nums[4]+""+nums[5]+"-"
            +nums[6]+""+nums[7]+""+nums[8]+""+nums[9];
    }
    public static String phoneBuilder2 (int [] nums) {
        return "("+getNumbers(nums, 0, 2)+") "+
                getNumbers(nums, 3, 5)+"-"+
                getNumbers(nums, 6, 9);
    }


    public static String getNumbers(int[] nums, int start, int stop) {
        String res = "";
        while (start <= stop) {
            res = res.concat(String.valueOf(nums[start]));
            start++;
        }
        return res;
    }

}
