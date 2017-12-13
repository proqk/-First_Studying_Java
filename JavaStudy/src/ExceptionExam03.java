public class ExceptionExam03 {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.toString());
        }catch (NullPointerException e){
            System.out.println(e.toString());
        }
    }
}
