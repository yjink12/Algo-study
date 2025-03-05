package com.algostudy.sprout.condition;

import java.util.Scanner;

/**
 * packageName    : com.algostudy.condition
 * fileName       : ConditionExample
 * author         : admin
 * date           : 2025-02-27
 * description    : 조건
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-27        admin       최초 생성
 */
public class ConditionExample {
  /**
   *  백준 1330
   *   - 두 수 비교하기
   */
  public void comparison() {
    Scanner input = new Scanner(System.in);

    int A = input.nextInt();
    int B = input.nextInt();

    input.close();

    // 내 풀이
    if (A>B) {
      System.out.println(">");
    } else if (A<B) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }

    // 좋은 풀이 -  삼항연산자 사용
    String str = (A>B) ? ">" : ((A<B) ? "<" : "==");
    System.out.println(str);
  }

  /**
   *  백준 9498
   *   - 시험 성적
   */
  public void examResult() {
    Scanner input = new Scanner(System.in);

    int result = input.nextInt();
    input.close();

    // 내 풀이
    if (90 <= result) {
      System.out.println("A");
    } else if (80 <= result) {
      System.out.println("B");
    } else if (70 <= result) {
      System.out.println("C");
    } else if (60 <= result) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    // 좋은 풀이 -  삼항연산자 사용
    System.out.println((result>= 90) ? "A" : (result >= 80)? "B" : (result >= 70)? "C" : (result>= 60) ? "D" : "F");
  }

  /**
   *  백준 14681
   *   - 사분면 고르기
   */
  public void quadrant() {
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();
    int y = input.nextInt();
    input.close();

    // 내 풀이
    if (x>=0 && y>=0)
      System.out.println(1);
    else if (x<0 && y<0)
      System.out.println(3);
    else if (x<0 && y>0)
      System.out.println(2);
    else
      System.out.println(4);
  }

  /**
   *  백준 2753
   *    - 윤년
   */
  public void leapYear() {
    Scanner input = new Scanner(System.in);

    int year = input.nextInt();
    input.close();

    // 내 풀이
    if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
      System.out.println(1);
    else
      System.out.println(0);

  }

  /**
   *  백준 2420
   *    - 사파리월드
   */
  public void safariWorld() {
    Scanner input = new Scanner(System.in);

    long n = input.nextLong();
    long m = input.nextLong();
    input.close();

    // 내 풀이
    long diff = n>m ? (n-m) : (m-n);
    System.out.println(diff);
  }
}
