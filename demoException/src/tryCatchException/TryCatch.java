package tryCatchException;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Vui lòng nhập dữ liệu: ");
	            try {
	                int so = Integer.parseInt(scanner.nextLine());
	                System.out.println(so + " * 3.14 = " + so * 3.14);
	            } catch (NumberFormatException e) {
	                System.out.println("Dữ liệu nhập không phải kiểu số!");
	            }
	        }
	}

}
