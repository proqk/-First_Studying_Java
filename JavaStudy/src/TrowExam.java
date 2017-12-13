public class TrowExam {
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        String[] name = new String[3];
        name[3] = "이유진";
    }

    public static void main(String[] args) {
        TrowExam t = new TrowExam();
        try{
            arrayMethod();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("예외발생  "+e.toString());
        }
    }
}
