
public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = {4,6,1,2,9,22};
		
		for(int i = 0; i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		//find the most optimized bubble sort
		
		for(int num:nums) {
			System.out.println(num);
		}
	}
}
