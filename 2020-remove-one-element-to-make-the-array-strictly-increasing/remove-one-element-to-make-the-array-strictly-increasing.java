class Solution {
    public boolean canBeIncreasing(int[] nums) {

        for (int remove = 0; remove < nums.length; remove++) {

            boolean increasing = true;
            int prev = -1;

            for (int i = 0; i < nums.length; i++) {

                if (i == remove)
                    continue;

                if (prev != -1 && nums[prev] >= nums[i]) {
                    increasing = false;
                    break;
                }

                prev = i;
            }

            if (increasing)
                return true;
        }

        return false;
    }
}