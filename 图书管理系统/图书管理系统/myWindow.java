package 图书管理系统;

public class myWindow {
    public static void main(String[] args) {
        Test win1=new Test();
//        System.out.println("要传过去的win1对象为："+win1);
        win1.init("图书管理系统",win1);
    }
}