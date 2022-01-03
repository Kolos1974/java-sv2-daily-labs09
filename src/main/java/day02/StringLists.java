package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        int shortest = words.get(0).length();
        for (String element : words) {
            if (shortest>element.length()){
                shortest=element.length();
            }
        }
        List<String> result = new ArrayList<>();
        for (String element: words){
            if (shortest==element.length()){
                result.add(element);
            }
        }

        return result;
    }

    public List<String> shortestWordsOfficial(List<String> words) {
        List<String> result = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String actual : words) {
            if (actual.length() < minLength) {
                minLength = actual.length();
                result.clear();
            }
            if (actual.length() == minLength) {
                result.add(actual);
            }
        }
        return result;
    }
}
