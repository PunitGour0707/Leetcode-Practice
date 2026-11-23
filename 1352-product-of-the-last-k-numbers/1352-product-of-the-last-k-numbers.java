class ProductOfNumbers {
    List<Integer> li;
    public ProductOfNumbers() {
        li=new ArrayList<>();
    }
    
    public void add(int num) {
        li.add(num);
    }
    
    public int getProduct(int k) {
        int ans=1;
        int n=li.size();
        for(int i=0;i<k;i++){
            ans*=li.get(n-1-i);
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */