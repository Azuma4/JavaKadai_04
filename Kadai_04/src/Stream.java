import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> names = List.of("sawamura", "azumane", "nishinoya", "tanaka", "kageyama", "hinata", "tukishima");
        System.out.println("●名前一覧");
        System.out.println(names);
        System.out.println("--------------------------------------------------------------------");

        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println("●アルファベット順（大文字表記）");
        System.out.println(sortedResult.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
        System.out.println("--------------------------------------------------------------------");

        List<String> filter = names.stream().filter(name -> name.contains("i") ).toList();
        System.out.println("●名前に「i」を含むものを抽出");
        System.out.println(filter);
        System.out.println("--------------------------------------------------------------------");

        boolean hasTanaka = names.stream().anyMatch(name -> name.equals("tanaka"));
        System.out.println("●tanakaは入っているか");
        System.out.println(hasTanaka);
        System.out.println("--------------------------------------------------------------------");

    }
}
