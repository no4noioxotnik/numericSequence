package com.ragimov_iap_java;

import java.util.*;

import static java.util.Arrays.asList;


public class SDifference {

    public static <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        Collection<T> intersect = new ArrayList<T>(a);
        intersect.retainAll(b);
        Collection<T> result = new ArrayList<T>(a);
        result.addAll(b);
        result.removeAll(intersect);//deleting common elements for both collections
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String multFirst = "First group: ";
        String multSecond = "Second group: ";

        System.out.println(multFirst + "Type the first number");
        int a = sc.nextInt();

        System.out.println(multFirst + "Type the second number");
        int b = sc.nextInt();

        System.out.println(multFirst + "Type the third number");
        int c = sc.nextInt();

        System.out.println(multSecond + "Type the first number");
        int d = sc.nextInt();

        System.out.println(multSecond + "Type the second number");
        int e = sc.nextInt();

        System.out.println(multSecond + "Type the third number");
        int f = sc.nextInt();

        Collection<String> first = new ArrayList(asList(a, b, c));
        Collection<String> second = new ArrayList(asList(d, e, f));
        Collection<String> fin = symmetricDifference(first,second);
        System.out.println("The Symmetric Difference: " + Arrays.toString(fin.toArray()));
    }
}
