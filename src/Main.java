import java.util.Arrays;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

// 11 Дан массив строк. Необходимо удалить из него все дубли, а оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] arrString = {"строка1", "строка5", "строка1", "строка2", "строка2", "строка4", "строка1", "строка3", "строка6", "строка1"};
        String itog = Arrays.stream(arrString).distinct().collect(Collectors.joining());
        System.out.println(itog);
    }
}