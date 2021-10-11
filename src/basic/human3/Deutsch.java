package basic.human3;

//フランス人クラス
class Deutsch extends Human {
    public Deutsch(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Ich heiße " + name + ".");
    }
}
