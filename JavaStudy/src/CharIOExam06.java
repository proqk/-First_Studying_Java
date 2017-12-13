import java.io.*;
public class CharIOExam06 {
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter("test.txt"));
        out.printf("내 나이는 %d살입니다\n", 18);
        out.println("나는 자바가 좋습니다.");
        out.print("매일매일 자바 공부해야지!!!");
        out.close();
    }
}
