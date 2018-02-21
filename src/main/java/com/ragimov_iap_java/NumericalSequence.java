package com.ragimov_iap_java;

import java.io.IOException;
import java.util.*;

/**
 * Created by Rustam_Ragimov on 2/20/2018.
 */
public class NumericalSequence {
    public static void main(String[] args) throws IOException {
        start();
    }

    private static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the numeric set separated by SPACE character: ");
        try {
            String sr = scanner.nextLine();
            List<String> collection = new ArrayList<String>();

            List list = Arrays.asList(sr.split("\\s+"));
            Iterator<String> iterate = list.iterator();
            int idx = 1;
            while (iterate.hasNext()) {
                String element = iterate.next();
                if (idx++ % 2 == 0) continue;
                collection.add(element);
            }
            ListIterator lit = collection.listIterator(collection.size());
            while (lit.hasPrevious()) {
                String element = (String) lit.previous();
                System.out.print(element + " ");
            }
        } catch (InputMismatchException e) {

            System.out.println("Only numbers are allowed, separated by SPACE character. Check your input.");

        } finally {
            Scanner ss = new Scanner(System.in);
            System.out.println("Do you want to start again? (y/n)");
            String  answer = ss.nextLine().toLowerCase();

            if (answer.equals("y")) {

                start();

            } else {

                return;
            }
        }
    }
}
