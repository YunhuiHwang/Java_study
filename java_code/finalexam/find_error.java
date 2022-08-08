package org.java_code.finalexam;

class find_error {
	public String w() {
		return "w 실행";
	}

	String x() {
		return z();
	}

	protected String y() {
		return z();
	}

	private String z() {
		return "z 실행";
	}

	
}
