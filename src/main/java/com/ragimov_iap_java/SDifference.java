package com.ragimov_iap_java;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Rustam_Ragimov on 2/20/2018.
 */
public class SDifference {

    public static <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        Collection<T> intersect = new ArrayList<T>(a);
        intersect.retainAll(b);
        Collection<T> result = new ArrayList<T>(a);
        result.addAll(b);
        result.removeAll(intersect);//deleting elements from both collections
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String multFirst = "Первое множество: ";
        String multSecond = "Второе множество: ";

        System.out.println(multFirst + "Введите первое число");
        int a = sc.nextInt();

        System.out.println(multFirst + "Введите второе число");
        int b = sc.nextInt();

        System.out.println(multFirst + "Введите третье число");
        int c = sc.nextInt();

        System.out.println(multSecond + "Введите первое число");
        int d = sc.nextInt();

        System.out.println(multSecond + "Введите второе число");
        int e = sc.nextInt();

        System.out.println(multSecond + "Введите третье число");
        int f = sc.nextInt();

        Collection<String> first = new ArrayList(asList(a, b, c));
        Collection<String> second = new ArrayList(asList(d, e, f));
        Collection<String> fin = symmetricDifference(first,second);
        System.out.println(Arrays.toString(fin.toArray()));
    }
}
