import java.util.ArrayList;

public class InputLineMapper {
    private final ArrayList<Integer> dF = new ArrayList<>();
    private final ArrayList<Integer> dComplementF = new ArrayList<>();
    private String result;

    public InputLineMapper(int[] minterms, int inputLineCount) {
        for (int term : minterms) {
            if (term % 2 == 0) {
                this.dComplementF.add(term);
            } else {
                this.dF.add(term);
            }
        }

        mapInputLines(inputLineCount);
    }

    private void mapInputLines(int n) {
        if(0 <= n && n <= 7) {
            // This will be the case when the function will be false no matter the value of input d.
            if (!dComplementF.contains(2 * n) && !dF.contains(2 * n + 1)) {
                this.result = ResultSet.ZERO.value;
            }
            // This will be the case when the function will be true no matter the value of input d.
            else if (dComplementF.contains(2 * n) && dF.contains(2 * n + 1)) {
                this.result = ResultSet.ONE.value;
            }
            // This will be the case when the functions value will be the same as the value of input d.
            else if (!dComplementF.contains(2 * n) && dF.contains(2 * n + 1)) {
                this.result = ResultSet.D.value;
            }
            // This will be the case when the functions value will be the opposite of the value of input d.
            else if (dComplementF.contains(2 * n) && !dF.contains(2 * n + 1)) {
                this.result = ResultSet.DComplement.value;
            }
        } else {
            System.out.println("Invalid input line value: " + n);
        }
    }

    public String getResult() {
        return result;
    }
}
