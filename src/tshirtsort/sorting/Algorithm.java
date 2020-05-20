package tshirtsort.sorting;

import java.util.List;
import tshirtsort.models.TShirt;

/**
 *
 * @author orestis
 */
public class Algorithm {

    public void sort(List<TShirt> arr, int low, int high, boolean sortType, int sortByProperty){
    }
    public void sort(List<TShirt> arr, boolean sortType, int sortByProperty){
    }

    public static void sortAndTime(Algorithm a, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        String algorithmName = a.getClass().getSimpleName();
        System.out.println("/// --------- ///");
        long startTime = 0;
        long endTime = 0;
        switch (sortByProperty) {
            // Size - 1
            case 1:
                startTime = System.currentTimeMillis();
                a.sort(shirts, 0, shirts.size() - 1, sortType, 1);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for "+algorithmName+"  by Size ASC: " + (endTime - startTime)); //qs.getClass().getSimpleName()
                } else {
                    System.out.println("Time Lapsed for "+algorithmName+" by Size DESC: " + (endTime - startTime));
                }
                break;
            // Color - 2
            case 2:
                startTime = System.currentTimeMillis();
                a.sort(shirts, 0, shirts.size() - 1, sortType, 2);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for "+algorithmName+" by Color ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for "+algorithmName+" by Color DESC: " + (endTime - startTime));
                }
                break;
            // Fabric - 3
            case 3:
                startTime = System.currentTimeMillis();
                a.sort(shirts, 0, shirts.size() - 1, sortType, 3);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for "+algorithmName+" by Fabric ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for "+algorithmName+" by Fabric DESC: " + (endTime - startTime));
                }
                break;
        }

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}
