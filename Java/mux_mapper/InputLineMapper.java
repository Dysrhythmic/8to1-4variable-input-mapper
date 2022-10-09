import java.util.ArrayList;

public class InputLineMapper {
    private int selectionLineCount;
    // xF represents the set of values that intersect with the given minterms and
    // where the last digit of the binary representation (in the 1's place) of the
    // minterm = 1
    private final ArrayList<Integer> xF = new ArrayList<>();
    // xComplementF represents the set of values that intersect with the given minterms and
    // where the last digit of the binary representation (in the 1's place) of the
    // minterm = 0
    private final ArrayList<Integer> xComplementF = new ArrayList<>();

    public InputLineMapper(int[] minterms, int muxVariableCount) {
        setSelectionLineCount(muxVariableCount);
        setMinterms(minterms);
    }

    public String[] mapInputLines() {
        ArrayList<String> results = new ArrayList<>();

        for (int n = 0; n < (this.selectionLineCount - 1); n++) {
            // This will be the case when the function will be
            // false no matter the value of input x.
            if (!xComplementF.contains(2 * n) && !xF.contains(2 * n + 1)) {
                InputLineMap map = new InputLineMap(ResultSet.ZERO, n);
                results.add(map.getMap());
            }
            // This will be the case when the function will be
            // true no matter the value of input x.
            else if (xComplementF.contains(2 * n) && xF.contains(2 * n + 1)) {
                InputLineMap map = new InputLineMap(ResultSet.ONE, n);
                results.add(map.getMap());
            }
            // This will be the case when the functions value will be
            // the same as the value of input x.
            else if (!xComplementF.contains(2 * n) && xF.contains(2 * n + 1)) {
                InputLineMap map = new InputLineMap(ResultSet.X, n);
                results.add(map.getMap());
            }
            // This will be the case when the functions value will be
            // the opposite of the value of input x.
            else if (xComplementF.contains(2 * n) && !xF.contains(2 * n + 1)) {
                InputLineMap map = new InputLineMap(ResultSet.XComplement, n);
                results.add(map.getMap());
            }
        }

        return results.toArray(new String[results.size()]);
    }

    public void setSelectionLineCount(int muxVariableCount) {
        double product = Math.pow(muxVariableCount - 1, 2);
        this.selectionLineCount = (int)product;
    }

    public void setMinterms(int[] minterms) {
        for (int term : minterms) {
            if (term % 2 == 0) { this.xComplementF.add(term); }
            else { this.xF.add(term); }
        }
    }
}
