package ex.inventory;

import java.awt.*;
import java.util.*;
import java.util.List;

import static ex.inventory.Constants.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        // pcListを初期化する
        List<PersonalComputer> pcList = new ArrayList<>();
        // PC情報をリストに追加
        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 40000, Constants2.BIT_64, Constants2.WINDOWS_10),
                new PersonalComputer("いけだ", 2, 1, 90000, Constants.BIT_64, Constants.WINDOWS_11),
                new PersonalComputer("いのうえ", 3, 1, 80000, Constants.BIT_64, Constants.WINDOWS_11),
                new PersonalComputer("たむら", 4, 2, 120000, Constants.BIT_32, Constants.MAC),
                new PersonalComputer("わだ", 5, 2, 30000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("くどう", 6, 2, 150000, Constants.BIT_64, Constants.MAC),
                new PersonalComputer("さらど", 7, 3, 40000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("あいざわ", 8, 3, 70000, Constants.BIT_32, Constants.MAC)
        ));

        // 保管倉庫ごとの在庫金額を抽出したいのでマップにする
        // storagePriceMapの初期化をする
        Map<Integer, List<Integer>> storagePriceMap = new HashMap<>();

        // Key：StorageNo
        // Value：Price
        for (PersonalComputer p : pcList) { //pcListの中身から繰り返し処理を行い値を取り出す
            int storageNo = p.getStorageNo();//複数回使うので変数として切り分けしている
            if (!storagePriceMap.containsKey(storageNo)) {//Mapの中に倉庫番号がkeyとして

                storagePriceMap.put(storageNo, new ArrayList<>());
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
        }


        // storagePriceMapの中身を表示
        System.out.println("// storagePriceMapの中身チェック");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("PC金額:" + entry.getValue());
        }

        // 応用編
        // 保管倉庫ごとの在庫内容を抽出したいのでマップにする
        // osMapの初期化をする
        Map<Integer, List<String>> osMap = new HashMap<>();

        // Key：StorageNo
        // Value：OS
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();
            if (!osMap.containsKey(storageNo)) {
                osMap.put(storageNo, new ArrayList<>());
            }
            osMap.get(storageNo).add(p.getOS());
        }

        // osMapの中身を表示
        System.out.println("// osMapの中身チェック");
        for (Map.Entry entry : osMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("OS:" + entry.getValue());
        }


        //storagePriceMapからさらに計算を行う
        //倉庫ごとのpc合計金額を計算して表示
        System.out.println("//倉庫ごとの合計金額");
        for (Map.Entry entry: storagePriceMap.entrySet()){
            double sum = 0; //合計を入れる変数を定義する
            for (Integer i : (List<Integer>)entry.getValue()) {
                sum +=i;
            }
            System.out.println("倉庫番号" +entry.getKey()+":");
            System.out.println("合計金額" + sum +"円");
        }

        //合計台数を表示
        System.out.println("//倉庫ごとの合計台数");
        for (Map.Entry entry:storagePriceMap.entrySet()){
            int cnt = ((List)entry.getValue()).size(); //合計台数
            System.out.println("倉庫番号" +entry.getKey()+":");
            System.out.println("合計金額" + cnt +"台");
        }

        //平均金額の変数を用意する
        double averagePrice = 0;

        //倉庫別に1台ごとの平均金額を表示
        System.out.println("//倉庫内の1台ごとの平均金額");
        for (Map.Entry entry :storagePriceMap.entrySet()){
            //合計を出す
            double sum = 0;//平均を入れる変数を定義する
            for (Integer i:(List<Integer>)entry.getValue()){
                sum +=i;
            }
            //数を数える
            int cnt = ((List)entry.getValue()).size();

            //平均の変数に値を詰める
            averagePrice = sum / cnt;

            System.out.println("倉庫番号" + entry.getKey());
            System.out.println("平均金額" + averagePrice + "円/台");
        }
    }
}
