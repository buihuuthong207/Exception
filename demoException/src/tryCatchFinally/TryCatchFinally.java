package tryCatchFinally;

import java.util.Date;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        boolean isrun = true;
        try {
            while (isrun) {
                System.out.println("Vui lòng nhập dữ liệu: ");
                String cmd = scanner.nextLine();
                switch (cmd) {
                    case "exit":
                        isrun = false;
                        scanner.close();
                        System.out.println("Ứng dụng đã đóng!");
                        break;
                    case "time":
                        System.out.println("Bây giờ là: " + new Date());
                        break;
                    default:
                        System.err.println("Từ khóa không đúng, vui lòng thử lại!");
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra!");
        } finally {
            System.out.println("Kết thúc chương trình!");
        }
	}

}
