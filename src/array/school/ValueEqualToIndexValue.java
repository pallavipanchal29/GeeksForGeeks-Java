package array.school;

import java.util.ArrayList;

public class ValueEqualToIndexValue
{
    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        ArrayList<Integer> ans = valueEqualToIndex(arr,arr.length);

        for(int i = 0;i<ans.size();i++)
            System.out.print(ans.get(i)+" ");
    }
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == i+1)
                ans.add(arr[i]);
        }
        return ans;
    }
}
