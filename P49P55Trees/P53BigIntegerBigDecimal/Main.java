package P49P55Trees.P53BigIntegerBigDecimal;

import java.util.*;

class Main {


    public static int findMinimumDays(List<Float> durations) {
        // Sort the durations in ascending order
        Collections.sort(durations);

        int days = 0;
        int i = 0;
        int j = durations.size() - 1;

        while (i <= j) {
            float currentDayTotal = durations.get(j);
            j--;

            while (i <= j && currentDayTotal + durations.get(i) <= 3.0) {
                currentDayTotal += durations.get(i);
                i++;
            }

            days++;
        }

        return days;
    }
     
         public static void main(String[] args) {
             List<Float> durations1 = Arrays.asList(1.01f, 1.01f, 1.01f, 1.4f, 2.4f);
             System.out.println(findMinimumDays(durations1));  // Output: 3
     
             List<Float> durations2 = Arrays.asList(1.9f, 1.04f, 1.25f, 2.5f, 1.75f);
             System.out.println(findMinimumDays(durations2));  // Output: 3
     
             List<Float> durations3 = Arrays.asList(1.5f, 1.5f, 1.5f, 1.5f);
             System.out.println(findMinimumDays(durations3));  // Output: 2
     
             List<Float> durations4 = Arrays.asList(3.0f, 3.0f, 3.0f);
             System.out.println(findMinimumDays(durations4));  // Output: 3
         }
}
