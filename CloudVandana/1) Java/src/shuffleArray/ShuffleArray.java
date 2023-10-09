package shuffleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
//https://leetcode.com/problems/shuffle-the-array/solutions/4148929/shufflearray/
	public static void main(String args []) {
		int arr [] = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			list.add(i);
		}
		Collections.shuffle(list);
		int count =0;
		for(int i : list) {
			arr[count++]=i;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
