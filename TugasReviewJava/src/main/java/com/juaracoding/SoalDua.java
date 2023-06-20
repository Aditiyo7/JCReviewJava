package com.juaracoding;

public class SoalDua {
    public void segitigaKebalik(int baris) {

        int num1 = 1;
        int numbr = 3;
        // untuk baris
        for (int i = baris; i >= 1; i--) {
            int num = num1;
            // untuk kolom
            if (num1 > 1) {
                int numset = numbr;
                for (int j = 1; j <= i+numset; j++) {
                    if (num % 2 == 0) {
                        System.out.print("_");
                    } else {
                        System.out.print(num);
                    }
                    num += 1;
                }
                numbr -= 1;
                System.out.println();
                num1 += 1;
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    if (j != i) {
                        System.out.print("_");
                    }
                    num += 2;
                }
                System.out.println();
                num1 += 1;
            }
//            end untuk kolom
        }
//        end untuk baris
    }
}
