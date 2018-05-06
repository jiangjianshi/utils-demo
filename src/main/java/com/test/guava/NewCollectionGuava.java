package com.test.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

/**
 * 新集合
 * 
 * @author bairong
 *
 */
public class NewCollectionGuava {

	public static void main(String[] args) {

		// 一种key可以重复的map，子类有ListMultimap和SetMultimap，对应的通过key分别得到list和set
		Multimap<String, Integer> multimap = ArrayListMultimap.create();
		multimap.put("abc", 1);
		multimap.put("abc", 2);
		multimap.put("abc", 3);
		multimap.put("abc", 4);
		multimap.put("abcd", 5);
		multimap.put("abcde", 6);
		for (Integer num : multimap.get("abc")) {
			System.out.println(num);
		}

		// 严格的说不是集合，可以增加重复的元素，并且可以统计出重复元素的个数，例子如下：
		Multiset<Integer> multiSet = HashMultiset.create();
		multiSet.add(10);
		multiSet.add(30);
		multiSet.add(30);
		multiSet.add(40);
		System.out.println(multiSet.count(30)); // 2
		System.out.println(multiSet.size()); // 4

		// 是一个一一映射，可以通过key得到value，也可以通过value得到key； 双向map
		BiMap<Integer, String> biMap = HashBiMap.create();
		biMap.put(1, "hello");
		biMap.put(2, "helloa");
		biMap.put(3, "world");
		biMap.put(4, "worldb");
		biMap.put(5, "my");
		biMap.put(6, "myc");

		System.out.println(biMap.get(2));
		int value = biMap.inverse().get("my");
		System.out.println("my --" + value);
	}
}
