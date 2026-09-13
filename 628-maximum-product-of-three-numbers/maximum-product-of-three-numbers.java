class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length <= 3){
           int mul = 1 ;
            for(int i=0; i<nums.length ; i++){
                mul = mul * nums[i];
            }return mul;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(product1, product2);
        
    }
}