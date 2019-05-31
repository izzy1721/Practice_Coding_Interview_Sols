int countPrimes(int n) {
        vector<bool> isPrime; 
        //zero and 1 are not prime but we don't know if anything else is 
        //prime or not up to n so assume everything is prime and mark false 
        //if not after this loop
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                isPrime.push_back(false); 
                continue; 
            }
            isPrime.push_back(true); 
        }
        //only check up to sqrt n for efficiency 
        int sqrtOfN = sqrt(n); 
        for (int i = 2; i <= sqrtOfN; i++) {
            //if known that not prime do not do anything 
            if (!isPrime[i]) {
                continue; 
            }
            //mark multiples of i as false up to n 
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false; 
            }
        }
        
        //count the number of primes marked as true
        //in the boolean vector
        int count = 0;   
        for(int i = 0; i < n; i++) {
            if (isPrime[i]) {
                count += 1; 
            }
        }
        
        return count;
    }
