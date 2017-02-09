package com.skcc.lcap.xdrmapper.test;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import com.skcc.lcap.xdrmapper.XdrMapConverter;

public class Test {

	@org.junit.Test
	public void test() {
		String input = "nw=4gxs	sys=ss001	loc-006-01.lcap-std-xdr-01.hdfs_s1	LCAP 2.0 D/C #1 - 1";
		StringTokenizer st = new StringTokenizer(input, "\t");
		XdrMapConverter conv = new XdrMapConverter();
		if (st.hasMoreTokens()) {
			conv.setRecordType(st.nextToken());
			conv.setSys(st.nextToken());
			conv.setInstanceName(st.nextToken());
			conv.setDcName(st.nextToken());

		}

		System.out.println(conv.getXdrMap());

	}

}
