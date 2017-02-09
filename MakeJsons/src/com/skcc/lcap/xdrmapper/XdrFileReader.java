package com.skcc.lcap.xdrmapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class XdrFileReader {

	public XdrMapList readFileAndMakeList(String path) {

		XdrMapList list = new XdrMapList();
		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			StringTokenizer st;

			// nw=4gxd sys=ss015 loc-001-05.lcap-std-xdr-01.hdfs_s1 D/C #9
			while ((line = bufferedReader.readLine()) != null) {
				XdrMapConverter mapConverter = new XdrMapConverter();
				st = new StringTokenizer(new String(line), "\t");
				mapConverter.setRecordType(st.nextToken());
				mapConverter.setSys(st.nextToken());
				mapConverter.setInstanceName(st.nextToken());

				mapConverter.setDcName(st.nextToken());

				list.add(mapConverter.getXdrMap());
			}
			fileReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
