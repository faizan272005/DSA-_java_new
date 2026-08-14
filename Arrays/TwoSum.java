public class TwoSum {
    public static void main(String[] args) {
       
        int[] nums = {2,4,7,5};
        int target = 9;
      TwoSum obj=new TwoSum();
      obj.twosum(nums,target);
    }
     public  void twosum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target) System.out.println(i+" "+j);
            }
        }
               
        }

    }
