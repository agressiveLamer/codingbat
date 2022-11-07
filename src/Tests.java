import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Tests {
    public static void main(String[] args) {
        String[] strings = {"aay", "bbyy", "ccy", "aAA", "cCC", "d"};
        HashMap<String, String> map = new HashMap<>();
        String str = "12*2*3*";
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(3);
        Methods m = new Methods();


        String[] array = {"Java", "Ruuuuussshhh"};
        Arrays.stream(array).map(s->s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Set<String> unique = new HashSet<>();
        unique.add("a");
        unique.add("b");
        unique.add("c");
        unique.add("a");
        List<String> list = unique.stream().toList();
        int index = 0;
        String[] strings1 = new String[list.size()];
        for (String s: list) {
            strings1[index] = s;
            index++;
        }

        System.out.println(strings1[2]);

    }
}