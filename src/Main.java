import java.util.*;

/**
 * Created by jiangshuhua on 2017/5/8.
 * 上传GitHub: http://blog.csdn.net/jeffleo/article/details/56017644
 */
public class Main {
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }

    public static void demoString() {
        String str = "hello world";
        print(1, str.indexOf('e'));
        print(2, str.compareTo("helloworld"));
        print(3, str.compareToIgnoreCase("Hello world"));
        print(4, str.replaceAll("o|l", "a"));
        print(5, str.replaceAll("hello", "hi"));
        print(6, str.contains("hello"));


        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append("false");
        sb.append(2.2);
        print(7, sb);


    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i));
            strList.add(String.valueOf(i * i));
        }
        print(1, strList);
        Collections.sort(strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(2, strList);
    }
    private static void demoSet() {
        Set<String> strSet = new HashSet<String>();
        for(int i = 0; i < 4; ++i){
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.addAll(Arrays.asList("a", "b", "c"));
        print(2, strSet);
    }
    private static void demoKeyValue() {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 4; ++i){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1, map);
        for(Map.Entry<String, String> entry : map.entrySet()){
            print(2, entry.getKey() + ":" + entry.getValue());
        }
        print(3, map.containsValue("0"));
        print(4, map.get("2"));
        map.replace("1", "A");

        print(5, map);
    }

    public static void main(String[] args) {
        //System.out.println("hello world");
        //print(1, "hello wore");
        //demoString();
        //demoList();
        //demoSet();
        demoKeyValue();
    }




}

