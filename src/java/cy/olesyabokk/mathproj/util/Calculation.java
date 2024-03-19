package cy.olesyabokk.mathproj.util;

import cy.olesyabokk.mathproj.service.InputScanner;

public class Calculation {
    public static void showMultipleTable() {
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 0) {
                    System.out.println("Multiplication table for number " + i);
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public static void showSegmentLength() {
        System.out.println("Enter axis X and Y for firstly for A point, then for B point");
        double[] nums = new double[4];
        int i = 0;
        do {
            nums[i] = InputScanner.getNum();
            i++;
        } while (i < 4);
        double length = Math.sqrt(Math.pow((nums[2] - nums[0]), 2) + Math.pow((nums[3] - nums[1]), 2));
        System.out.println(Math.abs(length));
    }
}
