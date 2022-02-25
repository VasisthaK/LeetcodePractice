class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        int totalCost =0;
        Arrays.sort(costs, (a,b)-> a[0]-a[1] - (b[0]-b[1]));
        for(int i=0;i<n;i++){
            totalCost += costs[i][0];
        }
        for(int i=n;i<costs.length;i++){
            totalCost += costs[i][1];
        }
        return totalCost;
    }
}