import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Total {
    double a, b, c, delta;

    public Total(double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double delta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void Nghiem(double a, double b, double c) {
        double x1;
        double x2;
        double delta = delta(a,b,c);
//        if (delta < 0) {
//           System.out.println("phương trình vô nghiệm");
//        } else if (delta == 0) {
//            x1 = -b / (2 * a);
//            System.out.println("phương trình có 1 nghiệm : " + x1);
//        } else {
//            x1 = (-b - Math.sqrt(delta)) / (2 * a);
//            x2 = (-b + Math.sqrt(delta)) / (2 * a);
//            System.out.println("phương trình có 2 nghiệm : " + x1 + "\n" + x2);
//        }
    }
    public static double X(double a, double b, double c){
        return -b / (2 * a);
    };
    public static double X1(double a, double b, double c , double delta){
        return (-b - Math.sqrt(delta)) / (2 * a);
    };
    public static double X2(double a, double b, double c , double delta){
        return (-b + Math.sqrt(delta)) / (2 * a);
    };





}
