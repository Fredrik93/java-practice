package org.example;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        for(int i =0; i<nums.length-1; i++){
            System.out.println("num: " + nums[i]);
            // iterate over list.
            if(nums[i] == '_'){
                i++;
            }
            // if i == i+1 then replace el i+1 with _
            if(nums[i] == nums[i+1]){
                nums[i+1] = -1;
            }
            // count integers in list
        }
        return -1;
    }

}
