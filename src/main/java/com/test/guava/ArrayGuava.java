package com.test.guava;

import java.util.Arrays;

import com.google.common.primitives.Ints;

/**
 * 对数组的操作
 * 
 * @author bairong
 *
 */
public class ArrayGuava {

	public static void main(String[] args) {
		
		//获取数组中某个值得索引
		int[] content = {1,3,4};
		int in = Ints.indexOf(content, 3); // 1 guava api
		System.out.println(in);
		System.out.println(Arrays.binarySearch(content, 4));// java api
		
		//合并两个数组
		int[] arr = Ints.concat(new int[] {1,2}, new int[]{3, 4});  // 1,2,3,4
		System.out.println(Arrays.toString(arr));
		
		
		//是否包含
		boolean result = Ints.contains(new int[]{10,20,30,40}, 20); // true
		System.out.println(result);
		
		//最小值
		int min = Ints.min(new int[]{10,20,30,40}); // 10
		System.out.println(min);
		
		//最小值
		int max = Ints.max(10,20,30,40); // 10
		System.out.println(max);
				
		//java中也有类似的api, 只能比较两个值
		System.out.println(Integer.max(1, 9));
	}
}
