public class ExceptionExam04 {
    public static void main(String[] args) {
        try {
            int data[] = new int[]{10, 20, 30, 40, 50};
            for (int i = 0; i < 6; i++) {
                System.out.println(data[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열인덱스초과");
//            e.printStackTrace();
        }
    }
}
