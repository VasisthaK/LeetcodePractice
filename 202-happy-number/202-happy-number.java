class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = sum(n);
            
        }
        return n==1;
    }
    
    int sum(int n){
        int sum =0;
        while(n>0){
            int d = n%10;
            n /=10;
            sum += d*d;
        }
        return sum;
    }
}