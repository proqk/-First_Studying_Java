import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        try {
            while(true){
                int i = r.read();
                if(i == -1) break;
                char c = (char)i;
                System.out.println(c);

            }
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println();
        r.close();
    }
}
