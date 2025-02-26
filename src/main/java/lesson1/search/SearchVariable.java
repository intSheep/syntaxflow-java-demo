package lesson1.search;

public class SearchVariable {
    public static void main(String[] args) {
        //赋值
        String myStr /*左值*/= "Hello World"/*右值*/;
        //简单方法
        exec("ls","-al");
        //链式调用方法
        Runtime.getRuntime().exec("ls -al");
    }
}
