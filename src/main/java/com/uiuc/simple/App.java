package com.uiuc.simple;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static List<String> getStringSetList(List<Integer> integers) {
        Set<String> integerSet = new HashSet<>();
        for(Integer val : integers) {
            integerSet.add(val.toString());
        }
        List<String> strings = new ArrayList<>();
        Iterator<String> iterator = integerSet.iterator();
        while(iterator.hasNext()) {
            strings.add(iterator.next());
        }
        return strings;
    }
}
