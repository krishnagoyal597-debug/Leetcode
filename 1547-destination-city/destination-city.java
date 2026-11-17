class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> from = new HashSet<>(); 

        for(List<String> path:paths){
            from.add(path.get(0));
        }
        for(List<String> path:paths){
            String too = path.get(1);

            if(!from.contains(too)){
                return too;
            }
        } return " ";

    }
}