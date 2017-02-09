package com.skcc.lcap.xdrmapper;

import java.util.ArrayList;

public class XdrMapList extends ArrayList<XdrMap> {

	public XdrMapList() {
		// TODO Auto-generated constructor stub

	}

	public XdrMapList getSprobes() {
		XdrMapList list = new XdrMapList();
		for (XdrMap map : this) {
			if (map.getRecordType().equals("sprobe")) {
				list.add(map);
			}
		}
		return list;
	}

	public XdrMapList getDprobes() {
		XdrMapList list = new XdrMapList();
		for (XdrMap map : this) {
			if (map.getRecordType().equals("dprobe")) {
				list.add(map);
			}
		}
		return list;
	}

}
