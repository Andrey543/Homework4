import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(33);
        h.add(22);
        h.add(11);
        h.add(46);
        System.out.println(h);
        h.remove(46);
        System.out.println(h);

    }

}