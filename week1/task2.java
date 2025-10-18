package week1;

public class task2 {

	public static void main(String[] args) {
		int range = 8;  
        int a = 0, b = 1;

        System.out.print(a + ", " + b);

        for (int i = 2; ; i++) {
            int c = a + b;
            System.out.print(", " + c);
            if (c > range) break; 
            a = b;
            b = c;
			
		}
		
        }
	}
	
