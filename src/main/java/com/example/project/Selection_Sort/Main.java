package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = new String[]{"Hello", "World", "Me"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        System.out.println(words);
        System.out.println(SelectionSort.selectionSortWordList(words));
    }
}
