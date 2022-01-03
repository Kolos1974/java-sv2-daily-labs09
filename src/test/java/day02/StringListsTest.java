package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordsTest(){
        List<String> list = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        StringLists stringLists = new StringLists();

        assertEquals(Arrays.asList("aa", "bb", "dd"), stringLists.shortestWords(list));

    }

}