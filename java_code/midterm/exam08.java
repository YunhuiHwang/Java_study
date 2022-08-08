package org.java_code.midterm;

public class exam08 {

	public static void main(String[] args) {
		System.out.println("8¹ø 60201393 È²À±Èñ");
		for (int i=1; i<6; ++i) {
			for(int j=1; j<6; ++j) {
				
				System.out.print(i+","+j + "  ");
			}System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if (i%2==0) {
					if(j%2==0) System.out.print(" 0 ");
					else System.out.print(" 1  ");
				}else {
					if(j%2==0) System.out.print(" 1 ");
					else System.out.print(" 0 ");
				}
			}System.out.println();
		}
	}

}
