class Solution {
    public int countPrimes(int n) {
        int primeNumbers =0;
        boolean isPrime = true;
        for(int i=2; i<=n; ++i){
            isPrime= true;
            for(int j=2; j<=i/2; ++j)
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            if(isPrime)
                ++primeNumbers;
            
            
        }
        return primeNumbers;
    }
}