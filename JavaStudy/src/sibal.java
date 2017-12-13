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
public class sibal {
    public static void main(String[] args) {
        Car car = null;
        Taxi t1 = new Taxi();
        Taxi t2 = null;
        t1.siren();
        t1.d();
        t1.s();
        car = t1;
        //car.siren();
        car.d();
        car.s();
        t2=(Taxi)car;
        t2.siren();
        t2.d();
        t2.s();
    }
}
*/