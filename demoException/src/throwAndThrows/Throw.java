package throwAndThrows;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào một số yêu thích : ");
		int number = Integer.valueOf(input.nextLine());
		if (number < 0) {
			try {
				throw new SoAmException("Không được nhập vào số âm!");
			} catch (SoAmException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Number love : " + number);
	}

}
