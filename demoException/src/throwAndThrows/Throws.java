package throwAndThrows;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào một số yêu thích : ");
		int number = Integer.valueOf(input.nextLine());
		System.out.println("heloman: " + number);
	}

}
