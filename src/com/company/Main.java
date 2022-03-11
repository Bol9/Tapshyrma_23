package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
	// write your code here
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayListOdd = new ArrayList<>();
        List<Integer> arrayListEven = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1,100));

        }
        System.out.println(arrayList);

        for (int i = 0; i < 50; i++) {

            while(true){
                int oddNumber = random.nextInt(1,100);
                if(oddNumber%2!=0){
                    arrayListOdd.add(oddNumber);
                    break;
                }

            }

        }
        arrayListOdd.forEach(System.out::println);

        for (int i = 0; i < 50; i++) {

            while(true){
                int evenNumber = random.nextInt(1,100);
                if(evenNumber%2==0){
                    arrayListEven.add(evenNumber);
                    break;
                }

            }

        }
        arrayListEven.forEach((x) -> System.out.print(x+", "));  // sout tun 3 turun ten koldondum .  1 jonokoi
                                                                 // 1 jonokoi
                                                                 // 2 chisi arrayListOdd.forEach(System.out::println);
                                                                 // 3 chusu arrayListEven.forEach((x) -> System.out.print(x+", "));




    }
}
