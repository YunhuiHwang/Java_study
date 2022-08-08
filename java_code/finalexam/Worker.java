package org.java_code.finalexam;

public class Worker {
	private String name;
	private boolean married;
	private int start_year;

	public void show_status() {
		String s;
		if (married)
			s = "±âÈ¥";
		else
			s = "¹ÌÈ¥";
		int y = (2022 - start_year);
		System.out.println("ÀÌ¸§: " + name + " °áÈ¥¿©ºÎ: " + s + " ¿¬Â÷: " + y+"³â");
	}

	public boolean change_marital_status() {
		if (married)
			married = false;
		else
			married = true;
		return married;
	}

	public Worker() {
		name = "noname";
		married = false;
		start_year = 2020;
	}

	public Worker(String n, boolean m, int sy) {
		name = n;
		married = m;
		start_year = sy;
	}

	public static void main(String args[]) {
		Worker Kim = new Worker();
		Worker Lee = new Worker("±è¸íÁö", false, 2010);
		Kim.show_status();
		Lee.show_status();
		Lee.change_marital_status();
		Lee.show_status();

	}
}
