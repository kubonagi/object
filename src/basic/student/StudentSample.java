package basic.student;

class StudentSample {
    public static void main(String[] args) {
        //変数の宣言（インスタンスの作成）
        Student student1 = new Student("あいざわ","男",1);
        Student student2 = new Student("川上", "男",2);

        //インスタンスの利用
        //値の取得
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);
        System.out.println(student2);

        //値のセット
        student1.setName("いがらし");
        student1.setGender("女");
        student1.setGrade(3);
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);
    }
}
