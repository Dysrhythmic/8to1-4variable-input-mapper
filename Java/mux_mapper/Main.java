import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        InputParser ip = new InputParser("./../input.txt");
        int[] minterms = ip.getMinterms();
        int varCount = ip.getVarCount();

        InputLineMapper ilm = new InputLineMapper(minterms, varCount);
        String[] results = ilm.mapInputLines();

        for (String result: results) { System.out.println(result); }
    }
}