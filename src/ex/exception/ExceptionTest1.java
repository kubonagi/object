package ex.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        //配列のサイズ以上、負の値で配列にアクセスした場合
        int [] num = {0,1,2,3};
        System.out.println(num[3]);
    }
}
