import java.util.*;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Put number : ");
        int n = scan.nextInt();
        if(n<0) {
        	System.out.printf("¡Ø Cannot Operate ¡Ø");
        }else if(n == 0) {
            System.out.println("------Result------");
        	for(int i=1; i<10; i++) {
        		for(int j=2; j<10; j++) {
                    System.out.printf("%d * %d = %d	", j, i, i*j);        			
        		}
        		System.out.printf("\n");
        	}
        }else {
            System.out.println("------Result------");
            for(int i=0; i<9; i++)
                System.out.printf("%d * %d = %d\n", n, i+1, (i+1)*n);
        }
        scan.close();
    }
}
