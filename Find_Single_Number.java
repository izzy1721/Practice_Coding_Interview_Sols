//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public int singleNumber(int[] nums) {
        /*
        * if one counts the number of occurances of each element 
        * in the array and checks if that value returns a count of 1
        * then that value is the solution 
        * Time Complexity: 
        *   O(n^2) due to iterating through whole list per element in the list to 
        *   count the number of occurances
        */
        int n = nums.length;
        for (int i = 0; i < n; i++) 
        {
            int key = nums[i]; 
            int tally = 0;
            
            //counting loop
            for (int j = 0; j < n; j++) 
            {
                if (nums[j] == key) 
                {
                    tally++; 
                }
            }//end of j loop
            
            //found the solution
            if (tally == 1) 
            {
                return key;
            }
        }//end of i loop
        
        //no solution 
        return -999; 
    }
