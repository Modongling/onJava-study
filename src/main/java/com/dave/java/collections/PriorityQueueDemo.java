package com.dave.java.collections;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);
        List<Integer> list = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3,
                9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(list);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> stringList = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(stringList);
        QueueDemo.printQ(stringPriorityQueue);
        stringPriorityQueue = new PriorityQueue<>(stringList.size(), Collections.reverseOrder());
        stringPriorityQueue.addAll(stringList);
        QueueDemo.printQ(stringPriorityQueue);

        Set<Character> characterSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            characterSet.add(c);
        }
        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(characterSet);
        QueueDemo.printQ(characterPriorityQueue);
    }
}
