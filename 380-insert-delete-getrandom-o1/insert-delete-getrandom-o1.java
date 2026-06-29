class RandomizedSet {
    HashMap<Integer,Integer> mp;
    ArrayList<Integer> li;
    Random r;
    public RandomizedSet() {
        mp=new HashMap<>();
        li=new ArrayList<>();
        r=new Random();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)){
            return false;
        }
        li.add(val);
        mp.put(val,li.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        int idx=mp.get(val);
        li.set(idx,li.get(li.size()-1));
        mp.put(li.get(li.size()-1),idx);
        mp.remove(val);
        li.remove(li.size()-1);
        return true;
    }
    
    public int getRandom() {
        return li.get(r.nextInt(li.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */