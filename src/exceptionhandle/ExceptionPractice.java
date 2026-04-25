package exceptionhandle;

public class ExceptionPractice {
	public static void main(String[] args) {
		
		
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		} finally {
			System.out.println("Program continues...");
		}

		//multiple catch
		try {
			int arr[] = new int[5];
			arr[10] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error" + e.toString());
		} catch (Exception e) {
			System.out.println("General error");
		}
		
		
		//own exception
		try {
			int age =16;
			if(age<18)
			{
				 throw new MyException("Access denied due to age constraint");
			}
           
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
	}
}
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}