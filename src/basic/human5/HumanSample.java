package basic.human5;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        IfSayHello[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("李"),
                new French("Louise"),
        };

        for (IfSayHello human:humans) {
            human.sayHello();
        }
    }
}