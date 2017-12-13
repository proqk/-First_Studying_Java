import java.util.*;

public class IOExamTotal_03 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            phone phoneserch = new phone();

            Scanner sc = new Scanner(System.in);
            System.out.println("이름입력: ");
            String name = sc.next();

            phoneserch.serch(name);
        }

    }

    class phone {

        String[][] data = {
                {"김선린", "02-123-1234", "서울시"},
                {"이유진", "02-2000-0616", "강서구"}
        };

        public void serch(String name) {
            for (int i = 0; i < 2; i++) {
                if (data[i][0].equals(name)) {
                    System.out.println(name + "의 정보\n" + "전화번호: " + data[i][1] + "\n" + "주소: " + data[i][2]);
                    break;
                }
            }
        }
    }

