import java.util.Arrays;

public class Array_permutation{
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ans = new int[nums.length];

        
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        
        System.out.println(Arrays.toString(ans));
        
        // buildArray(ans, nums);
    }

    // public static int[] buildArray(int[] mee, int[] wfi){
    //     for(int i = 0; i < wfi.length; i++){
    //         mee[i] = wfi[wfi[i]];
    //     }
    //     return mee;
    // }
}

// Example of [I@mdmfn..smtg..smtg error.

// Error because compiler doesnt know what to print 