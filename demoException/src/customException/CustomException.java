package customException;

public class CustomException {

	static void validate(int age) throws WrongAgeException {
        if (age < 18) {
            throw new WrongAgeException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validate(25);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
 
        System.out.println("rest of the code...");
    }
	

}
