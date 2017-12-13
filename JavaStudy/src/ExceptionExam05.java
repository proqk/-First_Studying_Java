public class ExceptionExam05 {
    public static void main(String[] args) {
        try{
            String data1 = "100";
            String data2 = "10";
            int v1= Integer.parseInt(data1);
            int v2 = Integer.parseInt(data2);
            System.out.println((v1+v2));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
