// Problem 1 (easy) Two sum

public class Twosum
{
public int[] twosum(int[] nums, int target)
{
  int val;
  for(int i=0;i<nums.length;i++)
  {
    val = target-nums[i];
    for(int j=i;j<nums.length;j++)
    {
      if (val == nums[j] && i!=j)
      {
        return new int[] {i,j};
      }
    }
  }
  return new int[] {};
}

public static void main(String[] args)
{
  int [] nums = {3,1,4,3};
  Twosum t = new Twosum();
  int [] res = t.twosum(nums,6);
  for(int k=0;k<res.length;k++)
  {
    System.out.print(res[k] + " ");
  }
}
}