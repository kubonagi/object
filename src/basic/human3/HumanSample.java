package basic.human3;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new Human("Tom"),
                new Japanese("ひろし"),
                new Chinese("李"),
                new French("Louise"),
                new Deutsch("Camilla")
        };

        for (Human human:humans) {
            human.sayHello();
        }
    }
}