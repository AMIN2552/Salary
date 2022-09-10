import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int worker1 = sc.nextInt();
        int worker2 = sc.nextInt();
        int worker3 = sc.nextInt();


        int a;
        if (worker1 > worker2) {
            a = worker1;
            worker1 = worker2;
            worker2 = a;
        }
        if (worker2 > worker3) {
            a = worker2;
            worker2 = worker3;
            worker3 = a;
        }
        if (worker1 > worker2) {
            a = worker1;
            worker1 = worker2;
            worker2 = a;
        }

        System.out.println(worker3 - worker1);
    }
}



