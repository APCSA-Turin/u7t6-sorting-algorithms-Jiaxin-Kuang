package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int elementsLength = elements.length, startIndex = 0;
        for(int i = 0; i < elementsLength; i ++){
            int min = Integer.MAX_VALUE, index = 0;
            for(int j = startIndex; j < elementsLength; j ++){
                if(elements[j] < min){
                    min = elements[j];
                    index  = j;
                }
            }
            int replacement = elements[i];
            elements[i] = min;
            elements[index] = replacement;
            startIndex ++;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int wordsSize = words.size(), startIndex = 0;
        for(int i = 0; i < wordsSize; i ++){
            String lastWord = "zyzzyva";
            int index = 0;
            for(int j = startIndex; j < wordsSize; j ++){
                if(words.get(j).compareTo(lastWord) < 0){
                    lastWord = words.get(j);
                    index  = j;
                }
            }
            String replacement = words.get(i);
            words.set(i, lastWord);
            words.set(index, replacement);
            startIndex ++;
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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
