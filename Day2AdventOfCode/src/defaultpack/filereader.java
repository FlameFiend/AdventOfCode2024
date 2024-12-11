package defaultpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class filereader {
	public static boolean increasing(String[] list) {
		for(int i = 1; i < list.length; i++) {
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			if(el1<=el0||el1-el0>3) {
				return false;
			}
		}
		return true;
	}
	public static boolean decreasing(String[] list) {
		for(int i = 1; i < list.length; i++) {
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			if(el1>=el0||el0-el1>3) {
				return false;
			}
		}
		return true;
	}
	public static boolean removing(String[] list) {
		if(increasing(list)||decreasing(list)) {
			return true;
		}
		String[] removedList = new String[list.length-1];
		for(int i=0;i<list.length;i++) {
			int k=0;
			for(int j=0; j<list.length;j++) {
				removedList[k] = list[j];
			}
			if() {
				
			}
			if(increasing(removedList)||decreasing(removedList)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("data1");
		
		try {
			Scanner scan = new Scanner(file);
			int x = 0;
			
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] elements = line.split(" ");
				
				System.out.println(Arrays.toString(elements));
				if(removing(elements)) {
					x++;
					System.out.println("Safe");
				} else {
					System.out.println(Arrays.toString(elements));
				}
			}
			System.out.println(x);
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
