package org.generalPractice;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public void Anagram(String str1, String str2) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char c: str1.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1 );
        }
        for(char c: str2.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) - 1 );
        }
        for(int val: mp.values()) {
            if(val != 0) {
                System.out.println("not an anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
