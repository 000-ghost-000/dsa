

### an algorithm is a set of steps or instruction need to complete a task

* linear search
	* this method is used to search the number (target) in a linear manner this takes the n iteration to complete 
	* n being the target
	* ``` java
	  import java.util.*;
	public class linear_search
		{
			public boolean search(int[] arr, int num)
				{
					for(int i = 0; i < arr.length; i++)
						{
							if(arr[i] == num)
								{
									return true;
								}
						}
					return false;
				}
			public static void main(String[] args)
				{
					int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
					System.out.println("enter the number to be searched");
					Scanner sc = new Scanner(System.in);
					int num = sc.nextInt();
					boolean result = new linear_search().search(arr, num)
					System.out.println(result);
				}
		}
		```
		