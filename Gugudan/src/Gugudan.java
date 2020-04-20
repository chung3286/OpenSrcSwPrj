import java.util.*;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Put number : ");
        int n = scan.nextInt();
        System.out.println("------Result------");
        for(int i=0; i<9; i++)
            System.out.printf("%d * %d = %d\n", n, i+1, (i+1)*n);
        scan.close();
    }
}