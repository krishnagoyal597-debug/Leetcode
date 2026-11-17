class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        int index = switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++ ;
            }
        } return count;
    }
}