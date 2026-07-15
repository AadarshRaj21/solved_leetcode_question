class Solution {
    public int removeDuplicates(int[] nums) {
        int cm =1;
        int offer=0;
        int k=1;

        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;

            }
            else{
                nums[offer+1]=nums[cm];
                offer++;
                cm++;
                k++;
            }

        }
       return k; 
    }
}