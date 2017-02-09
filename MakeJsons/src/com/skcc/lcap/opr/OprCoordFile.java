package com.skcc.lcap.opr;

public class OprCoordFile {
	private String oprConfigId;
	private String recordType;
	private String collector;
	private String ldiFilter;
	private String begin;
	private String end;
	private String number;

	public OprCoordFile(String oprConfigId, String recordType, String collector, String begin, String end,
			String number) {
		this.oprConfigId = oprConfigId;
		this.recordType = recordType;
		this.collector = collector;
		this.begin = begin + "00";

		this.end = end + "00";
		this.number = String.format("%02d", Integer.valueOf(number));
	}

	public OprCoordFile() {

	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	public String getLdiFilter() {
		if (recordType.equals("sprobe")) {
			ldiFilter = "1234567890";
		} else if (recordType.equals("dprobe")) {
			ldiFilter = "13579";
		}
		return ldiFilter;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin + "00";
	}

	public String getEnd() {
		return end + "00";
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = String.format("%02d", Integer.valueOf(number));

	}

	public String getOprConfigId() {
		return oprConfigId;
	}

	public void setOprConfigId(String oprConfigId) {
		this.oprConfigId = oprConfigId;
	}

	@Override
	public String toString() {
		String format = "{" + "\n" + "\"oprConfigId\":\"" + oprConfigId + "\"," + "\n"
				+ "\"recordType\":\"" + recordType + "\"," + "\n" + "\"collector\":\"" + collector + "\"," + "\n"
				+ "\"ldiFilter\":\"" + getLdiFilter() + "\"," + "\n" + "\"begin\":\"" + getBegin() + "\"," + "\n"
				+ "\"end\":\"" + getEnd() + "\"" + "\n" + "}";
		return format;
	}

}
