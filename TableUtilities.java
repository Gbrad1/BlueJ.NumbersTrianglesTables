

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String table = "";
      table = getMultiplicationTable(5);
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        table = getMultiplicationTable(10);
          return table;
    }

    public static String getMultiplicationTable(int tableSize) {
      String table = "";
      for (int row = 1; row <= tableSize; row++) {
        for (int column = 1; column <= tableSize; column++) {
          if (row * column < 10) {
            table += "  " + column * row + " |";
          } else if (row * column >= 10 && row * column < 100) {
            table += " " + column * row + " |";
          } else {
            table += row * column + " |";
          }

        } table += "\n";
      } return table;
    }
}
