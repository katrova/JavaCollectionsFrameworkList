package com.company;

import com.sun.org.apache.bcel.internal.generic.INEG;
import sun.util.resources.LocaleData;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.time.*;

/**
 * @author Vasylkivska Kateryna KNTEU
 * @varsion 1.0
 *
 * Module 3 task 1
 * JavaCollectionsFramework. List.
 *
 * The characteristics of my computer
 * MacBook Pro (13-inch, 2017, Two Thunderbolt 3 ports)
 * CPU: 2,3 GHz Intel Core i5
 * RAM:8 GB 2133 MHz LPDDR3
 *
 * 1. Create ArrayList and LinkedList containing  100 000 Integer elements.
 * Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on
 * the end of ones. Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from
 * the end of ones. Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from
 * the end of ones. Compare time intervals.
 *
 */
public class Main {
        // 1. Create ArrayList and LinkedList containing  100 000 Integer elements.
        // Compare time intervals.
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        //__________________________________________________________________________

        // 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end
        // of ones. Compare time intervals.

        System.out.println("----------------------The task 2----------------------------");
        // 2.1 Insert  new 1000 elements  on the  beginning of ones. Compare time intervals.
        LocalDateTime startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i, i);
        }
        LocalDateTime finishArray = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements  on the  beginning " +
                        "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //____________________________________________________________________________________

        LocalDateTime startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i, i);
        }
        LocalDateTime finishLinked = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements on the beginning " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");


        // 2.2. Insert  new 1000 elements  on the middle of ones.Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements  on the  middle " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //________________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements  on the  middle " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");

        // 2.3. Insert  new 1000 elements  on the end of ones.Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size() - 1;
            arrayList.add(size, i);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements  on the end " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 1, i);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for insert  new 1000 elements  on the end " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        System.out.println("----------------------The task 3----------------------------");
        //3. Update 1000 elements  from the  beginning, from  the middle  and from the end
        // of ones. Compare time intervals.

        //3.1 Update 1000 elements  from the  beginning of ones. Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            arrayList.set(i, j);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the beginning " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            linkedList.add(i, j);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the beginning " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        // 3.2 Update 1000 elements  from the  middle of ones.Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            arrayList.add(arrayList.size() / 2 + i, j);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the middle " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            linkedList.add(linkedList.size() / 2 + i, j);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the middle " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        // 3.3. Update 1000 elements  from the end of ones.Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            arrayList.add(arrayList.size() - 1 - i, j);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the end " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0, j = 0; i < 1000; i++, j += 2) {
            linkedList.add(linkedList.size() - 1 - i, j);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for update new 1000 elements  on the end " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        System.out.println("----------------------The task 4----------------------------");
        // 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end
        // of ones. Compare time intervals.

        // 4.1 Delete 1000 elements  from the  beginning of ones. Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the beginning " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the beginning " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        // 4.2 Delete 1000 elements  from the  middle of ones. Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size() / 2;
            arrayList.remove(size);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the middle " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size() / 2;
            linkedList.remove(size);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the middle " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

        // 4.3. Delete 1000 elements  from the end of ones.Compare time intervals.
        startArray = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        finishArray = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the end " +
                "in ArrayList - " + (startArray.until(finishArray, ChronoUnit.MILLIS)));
        //______________________________________________________________________________

        startLinked = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() -1);
        }
        finishLinked = LocalDateTime.now();
        System.out.println("Time for delete new 1000 elements  on the end " +
                "in LinkedList - " + (startLinked.until(finishLinked, ChronoUnit.MILLIS)));
        System.out.println("------------------------------------------------------------");
        //________________________________________________________________________________

    }
}

