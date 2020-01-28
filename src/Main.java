import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] mas1 = {2, 6, 9, 15};
        int[] mas2 = {0, 3, 5, 11};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i : mas1) a.add(i);
        for (int i : mas2) b.add(i);

        System.out.println("A" + a);
        System.out.println("B" + b + "\n");
        merge(a, b);
        System.out.println("A" + a);
        System.out.println("B" + b);
    }

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int j = 0;
        for (int i = 0; i < a.size() && j < b.size(); )
            if (a.get(i) >= b.get(j)) a.add(i++, b.get(j++));
            else i++;
        a.addAll(b.subList(j, b.size()));
    }
}
