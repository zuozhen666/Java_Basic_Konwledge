package prepare;

import java.util.*;

public class class04 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set entrySet = map.entrySet();
//        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue() - o1.getValue();
//            }
//        });
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(((o1, o2) -> o2.getValue()-o1.getValue()));
        for (Object obj : entrySet) {
            queue.add((Map.Entry) obj);
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll().getKey();
        }
        return ret;
    }
}
