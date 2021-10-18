package ex.student2;

import basic.human5.IfSayHello;
import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.List;

//学生クラス
class Student {
    //フィールド
    private String name;//名前
    private String gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    List<Gender> humans = new ArrayList<>();

    //コンストラクタ
    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    /**
     * テストの個人合計を求める
     * @return int 国語・数学・英語の合計点
     */
    public int sum() {
        return jap + math + eng;
    }

    /**
     * テストの個人平均を求める
     * @return double 国語・数学・英語の平均点
     */
    public double ave() {
        return sum() / 3.0;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f"
                ,name,gender,jap,math,eng,sum(),ave());
    }
}
