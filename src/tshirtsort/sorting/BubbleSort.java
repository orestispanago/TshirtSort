/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort.sorting;

import java.util.List;
import tshirtsort.models.TShirt;

/**
 *
 * @author mac
 */
public class BubbleSort {

    // boolean sortType, sortType == true, ASC --  sortType == false, DESC
    // int sortByProperty 
    // sortByProperty == 1 -- Size
    // sortByProperty == 2 -- Color 
    // sortByProperty == 3 -- Fabric 
    void bubbleSort(List<TShirt> arr, boolean sortType, int sortByProperty) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                switch (sortByProperty) {
                    // Size - 1
                    case 1:
                        // ASC
                        if(sortType) {
                            if (arr.get(j).getSize().ordinal() > arr.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else { // DESC
                            if (arr.get(j).getSize().ordinal() < arr.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                        
                        break;
                    // Color - 2    
                    case 2:
                        // ASC
                        if(sortType) {
                            if (arr.get(j).getColor().ordinal() > arr.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else { // DESC
                            if (arr.get(j).getColor().ordinal() < arr.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                        break;
                    // Fabric - 3
                    case 3:
                        // ASC
                        if(sortType) {
                            if (arr.get(j).getFabric().ordinal() > arr.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else { // DESC
                            if (arr.get(j).getFabric().ordinal() < arr.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[i] 
                                TShirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                        break;
                }
            }
        }

    }

}
