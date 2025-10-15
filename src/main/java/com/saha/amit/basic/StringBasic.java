package com.saha.amit.basic;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBasic {
    static Faker faker = new Faker();

    public static void main(String[] args) {
        String st = faker.howIMetYourMother().catchPhrase();
        reverseUsingCollection(st);
        reverseSimple(st);
        reverseUsingStream(st);
        countVowelsConsonants(st);


    }

    /*
    Not best of implementation but apart from space in result too many loops
     */
    public static void reverseUsingCollection(String st) {
        System.out.println("Input --> " + st);
        char[] ch = st.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (Character c : ch) {
            characterList.add(c);
        }
        Collections.reverse(characterList);
        String result = characterList.toString().replace(",", "");
        System.out.println("Reversed --> " + result);
    }

    /*
    Very simple loops
     */
    public static void reverseSimple(String st) {
        System.out.println("Input --> " + st);
        char[] ch = st.toCharArray();
        String result = "";
        for (int i = (st.toCharArray().length - 1); i > 0; i--) {
            result = result + ch[i];
        }
        System.out.println("Reversed --> " + result);
    }

    /*
    Using stream Collection
     */
    public static void reverseUsingStream(String st) {
        System.out.println("Input --> " + st);
        String result = "";
        List<Character> characterList = new ArrayList<>();
        characterList = st.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList());
        Collections.reverse(characterList);
        System.out.println("Reversed --> " + characterList.toString());
    }

    public static void countVowelsConsonants(String st){
        CharSequence [] vowels = {"a", "e", "i", "o", "u"};
        int vowelCount = 0;
        for (CharSequence c: vowels){
            if (st.contains(c)){
                vowelCount ++;
            }
        }
        System.out.println("Vowel count "+ vowelCount+ " Consonants count "+ (st.length()-vowelCount));
    }


}
