class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=10000;
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j<=min){
                        if(i+j<min){
                            res.clear();
                            min=i+j;
                        }
                        res.add(list1[i]);
                    }
                    break;
                }
            }
        }
        return res.toArray(new String[0]);
    }
}