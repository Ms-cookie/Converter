package com.skcc.lcap.xdrmapper;

public class XdrMapConverter {
	private XdrMap map;

	public XdrMapConverter() {
		map = new XdrMap();
	}

	public void setRecordType(String recordType) {

		map.setRecordType(recordType.substring(recordType.length() - 1, recordType.length()) + "probe");
	}

	public void setInstanceName(String instanceName) {
		map.setInstance(instanceName);

	}

	public void setSys(String sys) {
		map.setSys(sys.split("=")[1]);
	}

	public void setDcName(String dcName) {
		map.setDc(dcName);
	}

	public XdrMap getXdrMap() {
		return map;
	}

}
