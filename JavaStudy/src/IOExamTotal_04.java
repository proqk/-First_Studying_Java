import java.io.*;
import java.util.*;

public class IOExamTotal_04 {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("디렉토리 입력: ");
        String d = sc.next();
        System.out.println("파일명 입력: ");
        String f = sc.next();

        d += "\\";

        File isthere = new File(d+f);
        if(isthere.exists()){

            BufferedReader br = new BufferedReader(new FileReader(d+f));

            String str;

            while(true){
                str = br.readLine();
                if(str == null) break;
                System.out.println(str);

            }
            br.close();
        }
        else {
            System.out.println("응없어");
        }
    }

}
