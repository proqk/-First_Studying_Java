class Car{void d(){
    System.out.println("이거슨 Car안에 있는 drive");
}}
class am extends Car { void d(){
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

public class sibal3 {
    public static void drive(Car t){
        if(t instanceof am) ((Taxi)t).d();
        else if(t instanceof Taxi) ((Taxi)t).d();
        else t.d();
    }

    public static void main(String[] args) {

    }
}
