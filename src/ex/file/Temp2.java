package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) throws IOException {
        question2();
    }

    public static void question2() {
        /*
        Path path = Paths.get("./src/ex/file/temp.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
            writer.append("test");
        }
        catch(java.io.IOException e){
            e.printStackTrace();
         */
        String first = "./src/ex/file";
        String fileName = "Temp.txt";
        Path path = Path.of(first,fileName);
        if(Files.exists(path)){
            List<String>list = Arrays.asList("あいうえお","かきくけこ");//リストに代入
            try{
                Files.write(path,list);//ファイル図クラスのwriteメソッドのファイルネームでリストの値を書き込む
            }catch (java.io.IOException e){ //例外処理も記載
                e.printStackTrace();
            }
        }
    }
}
