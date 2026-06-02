import java.util.HashSet;
import java.util.Scanner;

public class Q2 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (set.contains(x))
                return true;
            set.add(x);
        }

        return false;
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

        Q2 obj = new Q2();
        boolean result = obj.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);

        sc.close();
    }
}