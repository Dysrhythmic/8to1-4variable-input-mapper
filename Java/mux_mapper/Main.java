public class Main {
    public static void main(String[] args) {
        int[] minterms = {0, 4, 5, 8, 9, 12, 13, 14, 15};

        for (int n = 0; n < 8; n++) {
            InputLineMapper iLM = new InputLineMapper(minterms, n);

            String output = String.format("input %d: %s", n, iLM.getResult());
            System.out.println(output);
        }
    }
}
