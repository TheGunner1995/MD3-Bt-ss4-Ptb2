import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a : ");
        double a = scanner.nextDouble();
        System.out.println("nhập số b : ");
        double b = scanner.nextDouble();
        System.out.println("nhập số c : ");
        double c = scanner.nextDouble();
        Total total = new Total(a,b,c);
        double delta = total.delta(a,b,c);
        if (delta < 0 ){
            System.out.println("phương trình vô nghiệm ");
        }else if(delta == 0){
            System.out.println(total.X(a,b,c));
        }else {
            System.out.println("phương trình có nghiệm 1 : "+ total.X1(a,b,c,delta));
            System.out.println("phương trình có nghiệm 2 : "+ total.X2(a,b,c,delta));
        }


    }
}