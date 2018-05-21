import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class problem1 {
	
	public int[] twoSolution(int[] nums,int target){
		int[] arr1 = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<nums.length;i++){
			Integer val = map.get(target-nums[i]);
			if(val == null){
				map.put(nums[i], i);
			}	
			else{
				arr1[0] = val;   // [2,4]
				arr1[1] = i;
			/*	arr1[0]= i;
				arr1[1]= val;  [4,2]
			*/	
				break;
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) throws Exception{
		int[] nums = new int[5];
		int[] arr2 = new int[2];
		int target = 8;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			nums[i] = in.nextInt();
		}
		//for(int j : nums)
		//System.out.println(nums[j]);
		System.out.println(Arrays.toString(nums));
		problem1 p = new problem1();
		arr2 = p.twoSolution(nums,target);
		System.out.println(Arrays.toString(arr2));
	}	
}
