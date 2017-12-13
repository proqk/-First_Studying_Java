import java.util.*;

public class ExceptionExam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[3];

        for(int i=0;i<5;i++) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                arr[c] = a / b;
                System.out.println("c=" + arr[c]);
            } catch (ArithmeticException e) {
                System.out.println("b의 값은 0이 안됨");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 범위 초과");
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값 입력, Int값으로 해");
            } catch (Exception e) {
                System.out.printf("그 외 모든 예외처리");
                System.out.println(e.toString());
                continue;
            } finally {
                System.out.println("finally문입니당");
            }
        }
    }
}
