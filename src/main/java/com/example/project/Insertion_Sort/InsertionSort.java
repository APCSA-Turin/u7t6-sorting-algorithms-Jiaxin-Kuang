package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0; 
        for(int i = 1; i < elements.length; i ++){
            int currentNum = elements[i];
            int j = i - 1;
            while(j >= 0 && currentNum < elements[j]){
                count ++;
                elements[j + 1] = elements[j];
                j --;
            }
            elements[j + 1] = currentNum;
        }
        System.out.println("Insertion Sort: Number of Loops: " + count);
        return elements;
    }

    public static int[] selectionSort(int[] elements) {
        int elementsLength = elements.length, count = 0;
        for(int i = 0; i < elementsLength - 1; i ++){
            int min = Integer.MAX_VALUE, index = i;
            for(int j = i + 1; j < elementsLength; j ++){
                count ++;
                if(elements[j] < min){
                    min = elements[j];
                    index  = j;
                }
            }
            int replacement = elements[i];
            elements[i] = min;
            elements[index] = replacement;
        }
        System.out.println("Selection Sort: Number of Loops: " + count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for(int i = 1; i < words.size(); i ++){
            String currentWord = words.get(i);
            int j = i - 1;
            while(j >= 0 && currentWord.compareTo(words.get(j)) < 0){
                words.set(j + 1, words.get(j));
                j --;
            }
            words.set(j + 1, currentWord);
        }
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int wordsSize = words.size();
        for(int i = 0; i < wordsSize; i ++){
            String lastWord = "zyzzyva";
            int index = i;
            for(int j = i + 1; j < wordsSize; j ++){
                if(words.get(j).compareTo(lastWord) < 0){
                    lastWord = words.get(j);
                    index  = j;
                }
            }
            String replacement = words.get(i);
            words.set(i, lastWord);
            words.set(index, replacement);
        }
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}