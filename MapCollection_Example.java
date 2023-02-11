
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection_Example {
    public static void main(String[] args){
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(21352030, "Md. Raihan P A");
        map.put(21352031, "Naveen Krishnan");
        map.put(21352032, "Nawal Siddique MK");
        map.put(21352033, "Nilanjan Das");
        map.put(21352040, "S. Priyadarshini");

        Set<Integer> set = map.keySet();
        for (Integer s : set){
            System.out.println(s + " --> " + map.get(s));
        }
    }
}
