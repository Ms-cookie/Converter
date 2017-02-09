package com.skcc.lcap.xdrmapper;

public class XdrMap {
	private String recordType;
	private String instance;
	private String sys;
	private String dc;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public boolean comareInstance(String locNum, String instanceNum) {
		String ins = "xdr-" + instanceNum;
		if (instance.contains(locNum) && instance.contains(ins))
			return true;
		else
			return false;
	}

	public String getSys() {
		return sys;
	}

	public void setSys(String sys) {
		this.sys = sys;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	@Override
	public String toString() {
		return "XdrMap [recordType=" + recordType + ", instance=" + instance + ", sys=" + sys + ", dc=" + dc + "]";
	}

}
