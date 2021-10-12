package basic.human4;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("李"),
                new French("Louise"),
        };

        for (Human human:humans) {
            human.sayHello();
        }
    }
}