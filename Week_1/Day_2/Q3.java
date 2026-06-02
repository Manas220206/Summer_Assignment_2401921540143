import java.util.Scanner;

public class Q3 {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left = 0, right = 0;

        for (; right < k; right++) {
            sum += nums[right];
        }

        double ans = sum / k;

        while (right < nums.length) {
            sum -= nums[left++];
            sum += nums[right++];
            ans = Math.max(sum / k, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Q3 obj = new Q3();
        double result = obj.findMaxAverage(nums, k);

        System.out.println("Maximum Average = " + result);

        sc.close();
    }
}