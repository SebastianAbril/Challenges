public class CumulativeSum {
    public static int[] cumulativeSum(int[] nums) {
        for(int i=1; i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arrayPrueba = {1, 2, 3};

        for(int number: cumulativeSum(arrayPrueba)){
            System.out.println(number);
        }
    }
}
