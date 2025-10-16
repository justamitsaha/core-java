package com.saha.amit.basic;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBasic {
    private static final Logger log = LoggerFactory.getLogger(StringBasic.class);

    static Faker faker = new Faker();

    public static void main(String[] args) {
        String st = faker.howIMetYourMother().catchPhrase();
        reverseUsingCollection(st);
        reverseSimple(st);
        reverseUsingStream(st);
        countVowelsConsonants(st);
        boolean b = isPalindrome("A man, a plan, a canal: Panama");
        log.info("Is Palindrome --> {}", b);
    }

    /*
    Too many conversions (inefficient), verbose
     */
    public static void reverseUsingCollection(String st) {
        log.info("Input String --> {}", st);
        List<Character> characters = st.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        Collections.reverse(characters);
        StringBuilder result = new StringBuilder(characters.size());
        characters.forEach(result::append);
        log.info("Reversed String--> {}", result);
    }

    /*
    Very simple loops  low level code
     */
    public static void reverseSimple(String st) {
        log.info("input --> {}", st);
        char[] ch = st.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            result.append(ch[i]);
        }
        log.info("reversed --> {}", result);
    }

    /*
    Using stream Collection, Slightly slower due to autoboxing, stream overhead
    Elegant, modern Java style
     */
    public static void reverseUsingStream(String st) {
        log.info("Input --> {}", st);
        String result = st.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        lst -> {
                            Collections.reverse(lst);
                            return lst.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining());
                        }));
        log.info("Reversed --> {}", result);
    }

    /*
    Using String builder to reverse the string better than above methods
    uses native java methods faster Internally optimized (native code).
     */
    public static boolean isPalindrome(String st) {
        String cleaned = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }


    public static void countVowelsConsonants(String st) {
        int vowels = 0, consonants = 0;
        st = st.toLowerCase();
        for (char ch : st.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) >= 0)
                    vowels++;
                else
                    consonants++;
            }
        }
        log.info("Vowels: {}, Consonants: {}", vowels, consonants);
    }
}
