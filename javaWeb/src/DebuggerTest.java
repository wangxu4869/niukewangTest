import java.util.HashMap;

public class DebuggerTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","18");
        map.put("school","HIT");
        map.put("major","Computer");
        String name = map.get("name");
        System.out.println("name = " + name);
        map.remove("major");
        System.out.println(map);
    }
}
