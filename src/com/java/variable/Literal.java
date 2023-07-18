
package com.java.variable;

public class Literal {

    // Integer Literals
    // The number 26, in decimal
    int decimalValue = 26;

    //  The number 26, in hexadecimal
    int hexadecimalValue = 0x1a;

    // The number 26, in binary
    int binaryValue = 0b11010; // 0b is symbolic as binary.

    // noted:
        // 1. decimal: 0 trough 9 numbers.
        // 2. hexadecimal: 0 trough 9, and A trough F.
        // 3. Binary: 0 and 1

    // floating-point literals
    double valueDouble = 123.4; // general

    // same value as valueDouble, but in scientific notation
    double valueDouble2 = 1.234e2; // E or e can use in float or double.
    float f1  = 123.4f;

    // Character and String Literals
    char charValue = '\u0000'; // selalu dipetik dengan single-quote
    String strValue = null; // null menandakan bahwa object dari kelas string tidak tersedia.
    // null hanya boleh digunakan pada class dan variable lainnya, kecuali variable primitive.

    String strValue2 = "Hello World!"; // hello world adalah String Literal

    // menggunakan karater garis bawah dalam literal numerik
    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi =  3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;
    // berguna untuk pemisah-an digit dalam kelompok tiga, seperti koma dan titik.

    // invalid and OK WITH Underscores.
    /*

    float pi1 = 3_.1415F;      // Invalid; cannot put underscores adjacent to a decimal point
    float pi2 = 3._1415F;      // Invalid; cannot put underscores adjacent to a decimal point
    long socialSecurityNumber1
            = 999_99_9999_L;         // Invalid; cannot put underscores prior to an L suffix

    int x1 = _52;              // This is an identifier, not a numeric literal
    int x2 = 5_2;              // OK (decimal literal)
    int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
    int x4 = 5_______2;        // OK (decimal literal)

    int x5 = 0_x52;            // Invalid; cannot put underscores in the 0x radix prefix
    int x6 = 0x_52;            // Invalid; cannot put underscores at the beginning of a number
    int x7 = 0x5_2;            // OK (hexadecimal literal)
    int x8 = 0x52_;            // Invalid; cannot put underscores at the end of a number

    int x9 = 0_52;             // OK (octal literal)
    int x10 = 05_2;            // OK (octal literal)
    int x11 = 052_;            // Invalid; cannot put underscores at the end of a number

    // pengetauan tentang underscores literal numerik ini, berguna untuk, contohnya; mengkonversi menit ke detik - dan sebaliknya.
    // menghitung/mengkonversi detik dari dua hari - dan sebaliknya.

     */

    // mengapa dijadikan komentar? karena program akan error!


    public static void main(String[] args) {
        // contoh program konversi menit ke detik
        // form: < value of minutes > * 60 seconds

        int minutes = 87_42;
        int seconds  = 60;

        int test = minutes * seconds;

        System.out.println("From " +  minutes +  " conversion to --> " + test + " Seconds");

    }


}
