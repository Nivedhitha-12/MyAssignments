package week1;

public class task3 {

	public static void main(String[] args) {
		int num = 8; 
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");

	}

}
