class Solution {
    public boolean containsDuplicate(int[] arr) {
     HashMap<Integer, Integer> map = new HashMap<>();

for (int num : arr) {

    if (map.containsKey(num)) {
        System.out.println(true);
        return true;
    }

    map.put(num, 1);
}

System.out.println(false);   
return false;
    }
}