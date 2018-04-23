package Homework_7;

public class countUniqueAlpha {

	public int countUnique (char[] nums) {
		int unique=0;
// 		intVal records the number of times a unique character in the range a-j has been encountered
		int [] intVal = new int[10];
		for (int i = 0; i<nums.length; i++) {
			if ((nums[i]>='a')&&(nums[i]<='j')) {				
				intVal[nums[i]-'a']++;
				if (intVal[nums[i]-'a']==1)
					unique++;
				else
					if (intVal[nums[i]-'a']==2) 
						unique--;
			}
		}
		return unique;
	 }
}