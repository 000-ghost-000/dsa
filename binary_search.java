public class binary_search
{
    public boolean search(int[] arr , int target)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)
            {
                return true;
                }
                else if(arr[mid] < target)
                {
                    left = mid + 1;
                    }
                    else
                    {
                        right = mid - 1;
                        }
                        }
                        return false;
                        }
                        public static void main(String[] args)
                        {
                            binary_search bs = new binary_search();
                            int[] arr = {1,2,3,4,5,6,7,8,9,10};
                            int target = 5;
                            System.out.println(bs.search(arr , target));
                            }
    }