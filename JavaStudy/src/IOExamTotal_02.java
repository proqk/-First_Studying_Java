import java.io.*;
import java.util.*;

public class IOExamTotal_02 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        InputStream in = System.in;
        byte[] gogo = new byte[2000];



        try {
            PrintWriter bw = new PrintWriter(new FileWriter("result.txt"));
            bw.println("이름\t주소\t값1\t값2\t총점\t평균");
            String str;

            while(true){
                str = br.readLine();
                if(str == null) break;

                bw.print(str);

                StringTokenizer st = new StringTokenizer(str);
                int i=0;
                String data[] = new String[5];

                while(st.hasMoreTokens()){
                    data[i] = st.nextToken();
                    ++i;
                }

                double a = Double.parseDouble(data[2]);
                double b = Double.parseDouble(data[3]);

                bw.println("\t"+(a+b)+"\t"+(a+b)/2);
//				bw.printf("\t%.1f\t%.1f\n", a+b, (a+b)/2);



            }
            bw.close();



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        br.close();
    }
}
