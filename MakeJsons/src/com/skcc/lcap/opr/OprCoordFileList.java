package com.skcc.lcap.opr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OprCoordFileList {
	List<OprCoordFile> list = new ArrayList<OprCoordFile>();

	public List<OprCoordFile> getList(String path) {
		readFileAndMakeList(path);
		return list;

	}

	public void readFileAndMakeList(String path) {

		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			StringTokenizer st;

			while ((line = bufferedReader.readLine()) != null) {
				OprCoordFile opr = new OprCoordFile();
				st = new StringTokenizer(new String(line), " \t");
				opr.setOprConfigId(st.nextToken());
				opr.setRecordType(st.nextToken());
				opr.setCollector(st.nextToken());

				opr.setBegin(st.nextToken() + st.nextToken());
				opr.setEnd(st.nextToken() + st.nextToken());
				opr.setNumber(st.nextToken());
				System.out.println(opr);

				list.add(opr);

			}
			fileReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
