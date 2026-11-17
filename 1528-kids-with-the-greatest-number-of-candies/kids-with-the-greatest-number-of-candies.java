class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> r = new ArrayList<>();
        

        int great = 0;

        for(int candy:candies){
            great = Math.max(great,candy);
        }
        
        for(int i = 0; i< candies.length; i++){
            r.add(candies[i]+extraCandies >= great);  
        }
        return r;
    }
}