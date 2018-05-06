package com.test.guava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JoinerSpliterGauva {

	public static void main(String[] args) {

		Joiner joiner = Joiner.on("; ").skipNulls();
		System.out.println(joiner.join("ay", null, "al", "love"));// ay; al;love

		List<String> joinListStr = new ArrayList<>();
		joinListStr.add("ay");
		joinListStr.add(null);
		joinListStr.add("al");
		joinListStr.add("love");
		Joiner joiner2 = Joiner.on("; ").skipNulls();
		System.out.println(joiner2.join(joinListStr));// ay; al; love
		
		
		// trimResults 和 omitEmptyStrings可以去空，去空白
		Iterable splitterArray = Splitter.on(',').trimResults().omitEmptyStrings().split("ay,al,,   love");
		System.out.println(splitterArray.toString());// [ay, al, love]

		// 传统的字符串分割
		String[] originArray = "ay,al,,   love".split(",");
		System.out.println(Arrays.toString(originArray));// [ay, al, , love]
		System.out.println(originArray.length);// 4(长度为)
		for (int i = 0; i < originArray.length; i++) {
			System.out.println(originArray[i]);
		}
		
		

		Map<String, String> cityDistMapper = ImmutableMap.of("海淀区", "北京", "朝阳区", "北京", "昌平区", "北京");
		String cityDistMapperStr = Joiner.on("|").withKeyValueSeparator("-").join(cityDistMapper);
		System.out.println(cityDistMapperStr);

		Map<String, String> cityDistMapper1 = Maps.newHashMap();
		String beijingDistricts = " 海淀区:北京|   朝阳区:北京| 东城区:北京 ||西城区:北京|昌平区:北京  |   |";
		cityDistMapper1.putAll(
				Splitter.on("|").omitEmptyStrings().trimResults().withKeyValueSeparator(":").split(beijingDistricts));
		System.out.println(cityDistMapper1.entrySet().toString());
	}
}
