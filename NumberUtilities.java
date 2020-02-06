


public class NumberUtilities {

    public static String getRange(int stop) {
      String toReturn = "";
      for (int i = 0; i < stop; i++) {
        toReturn += i; System.out.println(toReturn);
      } return toReturn;
    }

    public static String getRange(int start, int stop) {
      String toReturn = "";
      for (int i = start; i < stop; i++) {
        toReturn += i; System.out.println(toReturn);
      } return toReturn;
    }


    public static String getRange(int start, int stop, int step) {
      String toReturn = "";
      for (int i = start; i < stop; i += step) {
        toReturn += i; System.out.println(toReturn);
      } return toReturn;
    }

    public static String getEvenNumbers(int start, int stop) {
      String toReturn = "";
      for (int i = start; i < stop; i++) {
        if (i % 2 == 0) {
        toReturn += i; System.out.println(toReturn);
        }
      } return toReturn;
    }

    public static String getOddNumbers(int start, int stop) {
      String toReturn = "";
      for (int i = start; i < stop; i++) {
        if (i % 2 == 1) {
          toReturn += i; System.out.println(toReturn);
        }
      } return toReturn;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
      String toReturn = "";
      for (int i = start; i <= stop; i++) {
        int result = (int)Math.pow(i, exponent);
        toReturn += result; System.out.println(toReturn);
      } return toReturn;
    }
}
