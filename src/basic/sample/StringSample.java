package basic.sample;

import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        String word1 = "aaa";
        //文字列の結合
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        System.out.println(word1.concat("bbb"));//aaabbb

        //文字列の分割
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
        String sentence = "1-1,いのうえ,女,80,70,95";
        String [] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        //文字列の結合
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...)
        String joinWord = String.join("",data);
        System.out.println(joinWord);
    }
}
