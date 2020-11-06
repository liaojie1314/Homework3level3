package level2;

import java.util.Scanner;

/**
 * @author lenovo
 */
public class Test {
    public static void main(String[] args){
        fun i=new fun();
        jiafa s1=new jiafa();
        jianfa s2=new jianfa();
        chengfa s3=new chengfa();
        chufa s4=new chufa();
        System.out.println("请输入：");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        double str=scanner.nextInt();
        String op1=scanner2.next();
        double str3=scanner3.nextInt();
        scanner2.nextLine();
        while(true){
            if("+".equals(op1)){
                System.out.println("加法结果为：");
                i.func(s1, str, str3);
                break;
            }
            else if("-".equals(op1)) {
                System.out.println("减法结果为：");
                i.func(s2, str, str3);
                break;
            }
            else if("*".equals(op1)) {
                System.out.println("乘法结果为：");
                i.func(s3, str, str3);
                break;
            }
            else if("/".equals(op1)) {
                System.out.println("除法结果为：");
                i.func(s4, str, str3);
                break;
            }
            else{
                System.out.println("错误输入！！");
                break;
            }
        }
    }
}