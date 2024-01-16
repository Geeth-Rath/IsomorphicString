package org.example;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String e) {
        char[] sArry = s.toCharArray();
        char[] eArry = e.toCharArray();
        int i = 0;
        Map<Character, Character> hmap = new HashMap<>();
        if (sArry.length == eArry.length) {

            while (i <= sArry.length - 1) {
                if (hmap.isEmpty()) {
                    hmap.put(sArry[i], eArry[i]);
                } else if (hmap.containsKey(sArry[i]) && hmap.get(sArry[i]) != eArry[i]) {
                    return false;
                } else {
                    hmap.put(sArry[i], eArry[i]);
                }
                i++;

            }
        } else {
            return false;
        }
        return true;
    }

}
