package Mid_term_exam;

//Câu 1
//Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough
//a. Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
//b. Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
//(VD: You Only Live Once. But If You Do It Right. Once Is Enough)
//c. Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
//các chữ con lại viết thường (VD: You only live once. But if you do it right. Once is enough)

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = input.nextLine();

        //a. Đếm số từ viết in hoa trong chuỗi
        System.out.format("Quantity of uppercase words is %d", Question1.sumUpperCaseWord(str));
        System.out.println();

        //b. Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
        System.out.format("New string with uppercase first character is\n%s", Question1.upperFirstChar(str));

        //c. Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
        // các chữ con lại viết thường


    }
}
