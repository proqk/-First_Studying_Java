/*class Car{ void d(){
    System.out.println("달려");}
    void s(){
        System.out.println("멈춰");
    }
}
class Taxi extends Car{void d(){
    System.out.println("갓길~");}
    void siren(){
        System.out.println("삐뽀");
    }
}

public class sibal2 {
    public static void main(String[] args) {

        Taxi t1 = new Taxi();
        Car c1 = new Car();
        Car c2 = new Taxi();
        Taxi t2 = (Taxi) c2;
        if (c1 instanceof Taxi) {
            System.out.printf("엠뷸런스!!!!!");
        }
        if (c1 instanceof Car) {
            System.out.println("차!!!!!!!");
        }
        if (c1 instanceof Object) {
            System.out.println("c1은 객체!!!!!");
        }
        if (c2 instanceof Taxi) {
            System.out.println("엠뷸런스!!!");
        }
        if (c2 instanceof Car) {
            System.out.println("차1!!");
        }
        if (c2 instanceof Object) {
            System.out.println("c2는 객체이다.");
        }
    }
}
*/