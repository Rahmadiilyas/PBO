package praktikum3;

import java.util.HashSet;

public class no4 {

    public static void main(String[] args) {
        HashSet himpunanNiM = new HashSet();
        himpunanNiM.add("D0223309");
        himpunanNiM.add("D0223310");
        himpunanNiM.add("D0223311");
        himpunanNiM.add("D0223312");
        himpunanNiM.add("D0223313");
        himpunanNiM.add("D0223314");
        himpunanNiM.add("D0223315");
        System.out.println(himpunanNiM);

        if (himpunanNiM.contains("D0223309")) {
            System.out.println("Ada Nim : " + "D0223309");

        } else {
            System.out.println("Tidak ada Nim : " + "D0223309");
        }
    }
}
