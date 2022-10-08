import java.util.ArrayList;

public class Main {
    public enum ResultSet {
        ZERO("0"),
        ONE("1"),
        D("d"),
        DComplement("d'"),
        Error("Error");

        public final String value;

        ResultSet(String value) {
            this.value = value;
        }
    }
    public static ResultSet mapInputLineValues(int[] minterms, int n) {
        ArrayList<Integer> dF = new ArrayList<>();
        ArrayList<Integer> dComplementF = new ArrayList<>();

        for (int term : minterms) {
            if (term % 2 == 0) {
                dComplementF.add(term);
            }
            else {
                dF.add(term);
            }
        }

        if(0 <= n && n <= 7) {
            // This will be the case when the function will be false no matter the value of input d.
            if (!dComplementF.contains(2 * n) && !dF.contains(2 * n + 1)) {
                return ResultSet.ZERO;
            }

            // This will be the case when the function will be true no matter the value of input d.
            else if (dComplementF.contains(2 * n) && dF.contains(2 * n + 1)) {
                return ResultSet.ONE;
            }

            // This will be the case when the functions value will be the same as the value of input d.
            else if (!dComplementF.contains(2 * n) && dF.contains(2 * n + 1)) {
                return ResultSet.D;
            }

            // This will be the case when the functions value will be the opposite of the value of input d.
            else if (dComplementF.contains(2 * n) && !dF.contains(2 * n + 1)) {
                return ResultSet.DComplement;
            }

            else {
                return ResultSet.Error;
            }
        }
        else {
            System.out.println("Invalid input line value: " + n);
            return ResultSet.Error;
        }
    }

    public static void main(String[] args) {
        int[] minterms = {0, 4, 5, 8, 9, 12, 13, 14, 15};

        String result;

        for (int n = 0; n < 8; n++) {
            result = mapInputLineValues(minterms, n).value;

            String output = String.format("input %d: %s", n, result);
            System.out.println(output);
        }
    }
}