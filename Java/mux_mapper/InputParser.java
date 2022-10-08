import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class InputParser {
  private String path;
  private String contents;

  public InputParser(String path) {
    this.path = path;
    getContents();
  }

  private void getContents() {
    try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();

      while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
      }

      this.contents = sb.toString();
    } catch (Exception e) { System.out.println(e); }
  }

  public int[] getMinterms() {
    String[] lines = this.contents.split("\n");
    String line1 = lines[0];
    String terms = line1.replaceAll("[^0-9]", " ");
    terms = terms.replaceAll(" +", " ");

    Scanner sc = new Scanner(terms);
    ArrayList<Integer> minterms = new ArrayList<>();

    while (sc.hasNextInt()) { minterms.add(sc.nextInt()); }

    return minterms.stream().mapToInt(i -> i).toArray();
  }

  public int getVarCount() {
    String[] lines = this.contents.split("\n");
    String line2 = lines[1];
    String count = line2.replaceAll("[^0-9]", " ");
    count = count.trim();

    return Integer.parseInt(count);
  }

}