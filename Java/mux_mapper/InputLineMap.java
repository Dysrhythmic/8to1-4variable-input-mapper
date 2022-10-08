public class InputLineMap {
  private ResultSet input;
  private int inputLine;

  public InputLineMap(ResultSet inputValue, int inputLineNumber) {
    this.input = inputValue;
    this.inputLine = inputLineNumber;
  }

  public String getMap() {
    return String.format("input %d: %s", this.inputLine, this.input.value);
  }
}