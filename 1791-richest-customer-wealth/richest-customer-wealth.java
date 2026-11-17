class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int[] account : accounts) {
            int wealth = 0;
            for (int balance : account) {
                wealth += balance;
            }
            richest = Math.max(richest, wealth);
        }
        return richest;
    } 
}