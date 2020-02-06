

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
      String toReturn = "";
      for (int i = 1; i <= numberOfStars; i++) {
        toReturn += "*"; //System.out.println(toReturn);
      } return toReturn;
    }

    public static String getTriangle(int numberOfRows) {
      String toReturn = "";
      for (int i = 1; i <= numberOfRows; i++) {
        toReturn += getRow(i) + "\n"; System.out.println(toReturn);
      } return toReturn;
    }


    public static String getSmallTriangle() {
      String toReturn = "";
      for (int i = 1; i <= 4; i++) {
        toReturn += getRow(i) + "\n"; System.out.println(toReturn);
      } return toReturn;
    }

    public static String getLargeTriangle() {
      String toReturn = "";
      for (int i = 1; i <= 9; i++) {
        toReturn += getRow(i) + "\n"; System.out.println(toReturn);
      } return toReturn;
    }
} 
