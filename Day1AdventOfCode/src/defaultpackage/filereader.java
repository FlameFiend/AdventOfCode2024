package defaultpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		File file1 = new File("data1");	
			try {
				Scanner scan = new Scanner(file1);
				while(scan.hasNext()) {
					int first = scan.nextInt();
					int second = scan.nextInt();
					left.add(first);
					right.add(second);
				}
				int sum = 0;
				System.out.println(left);
				System.out.println(right);
				while(left.size()>0) {
					int minL = 0;
					int minR = 0;
					for(int i = 0; i<right.size();i++) {
						if(right.get(i)<right.get(minR)) {
							minR=i;
						}
					}
					for(int j = 0; j<left.size();j++) {
						if(left.get(j)<left.get(minL)) {
							minL=j;
						}
					}
					System.out.println(Math.abs(left.get(minL)-right.get(minR)));
					sum+=Math.abs(left.get(minL)-right.get(minR));
					left.remove(minL);
					right.remove(minR);
				}
				System.out.println("total difference sum is: " + sum);
				scan.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
