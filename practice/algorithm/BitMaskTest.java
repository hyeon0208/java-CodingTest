package algorithm;

public class BitMaskTest {
    public static void main(String[] args) {
        int x = 10; // 2진수로 변환시 1010
        int y = 15; // 2진수로 변환시 1100

        System.out.println("x (십진법) = " + x + " | (이진법) = " + Integer.toBinaryString(x));
        System.out.println("y (십진법) = " + y + " | (이진법) = " + Integer.toBinaryString(y));
        System.out.println("x & y (AND 연산) (십진법) = " + (x & y) +" | (이진법) = " + Integer.toBinaryString(x & y));
        System.out.println("x | y (OR 연산) (십진법) = " + (x | y) + " | (이진법) = " + Integer.toBinaryString(x | y));
        System.out.println("x ^ y (XOR 연산) (십진법) = " + (x ^ y)  + " | (이진법) = " + Integer.toBinaryString(x ^ y));
        // int는 32bit이기때문에 앞의 28개의 0이 0의 보수인 1으로 변경되어 출력
        System.out.println("~x (NOT 연산) (십진법) = " + ~x +" | (이진법) = " + Integer.toBinaryString(~x));
        System.out.println("--------------------------------------");

        int z = -32;
        System.out.println("z (십진법) = " + z + " | (이진법) = " + Integer.toBinaryString(z));
        System.out.println("z << 2 (십진법) = " + (z << 2) + " | (이진법) = " + Integer.toBinaryString(z << 2));
        System.out.println("z >> 2 (십진법) = " + (z >> 2) + " | (이진법) = " + Integer.toBinaryString(z >> 2));

        int k = 128;
        System.out.println("k (십진법) = " + k + " | (이진법) = " + Integer.toBinaryString(k));
        System.out.println("k << 2 (십진법) = " + (k << 2) + " | (이진법) = " + Integer.toBinaryString(k << 2));
        System.out.println("k >> 2 (십진법) = " + (k >> 2) + " | (이진법) = " + Integer.toBinaryString(k >> 2));
        System.out.println("~(k >> 2) + 1) (십진법) = " + (~(k >> 2) + 1 + " | (이진법) = " + Integer.toBinaryString(~(k >> 2) + 1)));
    }
}
