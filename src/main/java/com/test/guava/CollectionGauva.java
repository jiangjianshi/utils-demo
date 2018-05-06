package com.test.guava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * 
 * @author bairong 集合创建和初始化
 */
public class CollectionGauva {

	public static void main(String[] args) {
		
		
		List<String> slist = new ArrayList<>();
		List<String> slist1 = Lists.newArrayList();
		
		Set<String> set = Sets.newHashSet("one", "two", "three");
		List<String> list = Lists.newArrayList("one", "two", "three");
		
		/**
		 * 
		 */
		Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
		List<List<Map<String, String>>> listnormal = new ArrayList<List<Map<String, String>>>();

		Map<String, Map<String, String>> map1 = Maps.newHashMap();
		List<List<Map<String, String>>> list1 = Lists.newArrayList();
		
		
		/**
		 * 不可变list
		 */
		ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");
		System.out.println(of);
		
		
		ImmutableMap<String, String> immutablemap = ImmutableMap.of("key1", "value1", "key2", "value2");
		ImmutableSet<Integer> numbers = ImmutableSet.of(10, 20, 30, 40, 50);
		
		
	}

}
