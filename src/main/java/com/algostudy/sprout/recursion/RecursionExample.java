package com.algostudy.sprout.recursion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName    : com.algostudy.recursion
 * fileName       : RecursionExample
 * author         : admin
 * date           : 2024-09-28-028
 * description    : 순환 (Recursion)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-28-028        admin       최초 생성
 */
public class RecursionExample {
  public void sprout() {
    System.out.println("         ,r\'\"7");
    System.out.println("r`-_   ,\'  ,/");
    System.out.println(" \\. \". L_r\'");
    System.out.println("   `~\\/");
    System.out.println("      |");
    System.out.println("      |");
  }
//  public static int func(int n) {
//    if (n == 0)
//      return 0;
//    else {
//      return n + func(n-1);
//    }
//  }

//  public static double power(double x, int n) {
//    if (n==0)
//      return 1;
//    else
//      return x * power(x, n-1);
//  }
//  public static int fibonacci(int n) {
//    if (n<2)
//      return n;
//    else
//      return fibonacci(n-1) + fibonacci(n-2);
//  }
  public static int gcd(int m, int n) {
//    if (m<n) {
//      // swap m and n;
//      int tmp = m;
//      m = n;
//      n = tmp;
//    }
//    if (m%n == 0)
//      return n;
//    else
//      return gcd(n, m%n);
    if (n == 0)
      return m;
    else
      return gcd(n, m%n);
  }
}
