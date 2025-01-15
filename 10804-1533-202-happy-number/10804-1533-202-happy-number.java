class Solution {
    public boolean isHappy(int n) {

        Set<Integer> a = new HashSet<>();
        
        while (n != 1 && !a.contains(n)) {
            a.add(n);
            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }
    

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; 
            sum += digit * digit; 
            n /= 10; 
        }
        return sum;
    }
}
