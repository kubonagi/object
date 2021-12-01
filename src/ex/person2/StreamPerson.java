package ex.person2;

import basic.sample.enumsample.Gender;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Map<Birthplace, List<Person>> birthplacePersonMap = new HashMap<>();

        //人物追加
        personList.addAll(Arrays.asList(
                new Person("やまだ", Birthplace.HOKKAIDO, Gender.MEN, 35),
                new Person("いけだ", Birthplace.HOKKAIDO, Gender.WOMEN, 26),
                new Person("いのうえ", Birthplace.FUKUOKA, Gender.MEN, 32),
                new Person("たむら", Birthplace.FUKUOKA, Gender.WOMEN, 22),
                new Person("わだ", Birthplace.TOKYO, Gender.MEN, 42),
                new Person("くどう", Birthplace.TOKYO, Gender.WOMEN, 55),
                new Person("さらど", Birthplace.OSAKA, Gender.MEN, 31),
                new Person("あいざわ", Birthplace.OSAKA, Gender.WOMEN, 44)
        ));

        //Streamの練習
        //年齢が35歳以上の人の名前だけを表示
        System.out.println("練習1");
        personList.stream()
                .filter(p -> p.getAge() >= 35)
                .forEach(p -> System.out.println(p.getName()));

        //年齢が35歳未満の人を表示
        System.out.println("練習2");
        personList.stream()
                .filter(p -> p.getAge() < 35)
                .forEach(System.out::println);

        //Personの中身を順次表示
        System.out.println("課題1");
        personList
                .forEach(System.out::println);

        //名前だけ表示
        System.out.println("課題2");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        //男性のみを表示
        System.out.println("課題3");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        //女性のみを表示
        System.out.println("課題3-1");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //年齢の降順に並び替えて表示
        System.out.println("課題4");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        //年齢の昇順に並び替えて表示
        System.out.println("課題4-1");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);


        //男性のみ名前の昇順に並べ替えて表示
        System.out.println("課題5");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        //女性のみの名前の降順で並べ替えて表示
        System.out.println("課題5-1");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

        //PersonListから名前リストを生成して表示
        System.out.println("課題6");
        List<String> nameList = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        //性別でグルーピングしたMAP<Gender,Person>を生成し、内容を表示
        System.out.println("課題7");
        Map<Gender, List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        map.entrySet().stream()
                .map(s -> s.getKey().getJpName() + ":" + s.getValue())
                .forEach(System.out::println);

        //男性で最年長の人を表示
        System.out.println("課題8");
        Optional<Person> person = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));
        person.ifPresent(System.out::println);

        //女性で最年少の人を表示
        System.out.println("課題9");
        Optional<Person> person2 = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        person2.ifPresent(System.out::println);

        //女性の平均年齢を求めて表示
        System.out.println("課題10");
        OptionalDouble womenAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womenAverageAge.ifPresent(a -> System.out.println("女性の平均年齢" + a));

        //男性の平均年齢を求めて表示
        System.out.println("課題11");
        OptionalDouble menAverageAage = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        menAverageAage.ifPresent(a -> System.out.println("男性の平均年齢" + a));
    }
}
