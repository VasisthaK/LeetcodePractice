class KthLargest {
    PriorityQueue<Integer> pq;
    int maxSize;
    public KthLargest(int k, int[] nums) {
        maxSize =k;
        pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>maxSize){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */