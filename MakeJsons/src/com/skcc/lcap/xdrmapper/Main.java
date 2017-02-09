package com.skcc.lcap.xdrmapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		String path = "C:\\Users\\Administrator\\Desktop\\임시폴더\\input\\xdr_mapping.txt";
		XdrFileReader reader = new XdrFileReader();
		XdrMapList list = reader.readFileAndMakeList(path);
		// for (XdrMap xdrMap :list ) {
		// System.out.println(xdrMap.toString());
		// }

		List<String> locs = new ArrayList<String>();
		List<String> instances = new ArrayList<String>();
		locs.add("002-05");
		locs.add("006-01");
		locs.add("006-05");
		locs.add("006-06");
		instances.add("01");
		instances.add("02");
		instances.add("01");
		instances.add("02");

		System.out.println("-------------------------------------");
		for (XdrMap map : list) {
			System.out.println(map.toString());
		}
		System.out.println("-------------------------------------");

		for (int i = 0; i < locs.size(); i++) {
			for (XdrMap xdrMap : list) {
				if (xdrMap.comareInstance(locs.get(i), instances.get(i))) {
					System.out.println(xdrMap.getRecordType()+"\t"+xdrMap.getSys());
				}
			}
		}

		// loc-002-05(LCAP DC#10), Instance #1
		// loc-006-01(LCAP 2.0 D/C 0), #2
		// loc-006-05(LCAP 2.0 DC#05), #1
		// loc-006-06(LCAP 2.0 DC#06), #2

		// for (int i = 0; i < list.size(); i++) {
		//
		// System.out.println(" ./oprperiod-put.sh " +
		// list.get(i).getOprConfigId() + ".json");
		// }
		//
		// System.out.println("----------------------------------------------------------------------");
		// for (int i = 0; i < list.size(); i++) {
		//
		// System.out.println(" get /lcap/opr/config/history/" +
		// list.get(i).getOprConfigId());
		// }

	}
}
