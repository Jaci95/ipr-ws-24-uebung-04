public class Exercise4 {

    static int frequency(String[] list, String searchWord) {
        int counter = 0;

if (list == null || list.length == 0 ) {
                return -99;            
            } else if (searchWord == null || searchWord.length() == 0 ) {
                return -88;            
            }

        for (int i = 0; i < list.length; i++) {
            
            if (list[i].equals(searchWord)) {
                counter++;            
            }

        }
        return counter;
    }
    
    static boolean isValidSudokuNumber(int[][] sudoku, int sudokuNumber) {
        // your code
        while (sudoku.equals(sudokuNumber)) {
            return false;
        }

    }
        
    static float calcAvgHotDaysTemperature (int[] temperatures) {
        // your code
        return 100.0f; // just to compile
    }

    public static void main(String[] args) throws Exception {

        //--- Testing frequency algorithm --------------------------
        System.out.println(frequency(new String[] {"apple", "banana", "apple", "orange", "apple"}, "apple"));
        System.out.println(frequency(new String[] {"apple", "banana", "apple", "orange", "apple"}, "Apple"));
        System.out.println(frequency(new String[] {"apple", "banana", "apple", "orange", "apple"}, "grape"));
        System.out.println(frequency(new String[] {}, "apple"));
        System.out.println(frequency(null, "apple"));
        System.out.println(frequency(new String[] {"apple", "banana", "apple", "orange", "apple"}, ""));
        System.out.println(frequency(new String[] {"apple", "banana", "apple", "orange", "apple"}, null));

        //--- Testing isValidSudokuNumber ---------------------
        System.out.println(isValidSudokuNumber(new int[][] {{0, 1, 9}, {4, 0, 3}, {0, 0, 2}}, 5));
        System.out.println(isValidSudokuNumber(new int[][] {{0, 1, 9}, {4, 0, 3}, {0, 0, 2}}, 1));
        System.out.println(isValidSudokuNumber(new int[][] {{0, 1, 9}, {4, 0, 3}, {0, 0, 2}}, 0));
        System.out.println(isValidSudokuNumber(new int[][] {{0, 1, 9}, {4, 0, 3}, {0, 0, 2}}, 10));
        
        //--- Testing calcAvgHotDaysTemperature ----------------------------------
        System.out.println(calcAvgHotDaysTemperature(new int[] {20, 30, 40, 50, 60}));
        System.out.println(calcAvgHotDaysTemperature(new int[] {20, 29, 33, 37, 51, 60}));
        System.out.println(calcAvgHotDaysTemperature(new int[] {-100, -20, 40, 44, 200, 55}));
        System.out.println(calcAvgHotDaysTemperature(new int[] {20, 21, -4, 12, 23}));
        System.out.println(calcAvgHotDaysTemperature(new int[] {}));
        System.out.println(calcAvgHotDaysTemperature(null));
    }
    
}
