import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    private List<String> simpleTest(ArrayList<String> initList) {
        List<String> result = initList.stream().
                distinct().
                filter((s) -> s.length() < 5).
                collect(Collectors.toList());
        return result;
    }



    public static void main(String[] args) {
        String[] array = new String[]{"hello", "nihao", "cmu", "heel", "helo"};
        List<String> result = Arrays.stream(array).
                filter((s) -> s.startsWith("he")).
                map(s -> s.substring(0,3)).
                collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
