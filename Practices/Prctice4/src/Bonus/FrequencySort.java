package Bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {
    public static int[] sort(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            if (num < 0 || num > 10) {
                throw new IllegalArgumentException("Write a number between 0 and 10");
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }

        list.sort((a, b) -> {
            int freqCompare = Integer.compare(freq.get(b), freq.get(a));
            if(freqCompare == 0){
                return Integer.compare(a, b);
            }
            return freqCompare;
        });

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
