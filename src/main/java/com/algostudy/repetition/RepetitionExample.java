package com.algostudy.repetition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName    : com.algostudy.repetition
 * fileName       : RepetitionExample
 * author         : admin
 * date           : 2025-03-04-004
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-04-004        admin       최초 생성
 */
public class RepetitionExample {
  /**
   *  백준 2741
   *   - N 찍기
   */
  public void nmark() {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    input.close();

    // 내 풀이
    for (int i = 1; i<=N; i++) {
        System.out.println(i);
    }

    // 다른 풀이
    int i = 1;
    while (i <= N) {
      System.out.println(i);
      i++;
    }
  }

  /**
   *  백준 10872
   *   - 팩토리얼
   *     : n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1
   *     : 1! = 1 * 0! = 1
   */
  public void factorial() {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    input.close();

    // 내 풀이
    int result = 1;
    for (int i=1; i<= N; i++) {
      result = result*i;
    }
    System.out.println(result);

  }

  /**
   *  백준 10950
   *   - A+B-3
   */
  public void AB3() {
    Scanner input = new Scanner(System.in);

    System.out.println("테스트 케이스 개수 T를 입력하세요.");
    int T = input.nextInt();
    int[] arr = new int[T];

    // A+B 결과 저장
    for (int i=0; i<T; i++) {
      int A = input.nextInt();
      int B = input.nextInt();
      arr[i] = A+B;
    }
    input.close();

    // 출력
    for (int ar : arr) {
      System.out.println(ar);
    }

  }

  /**
   *  백준 10952
   *   - A+B-5
   */
  public void AB5() {
    Scanner input = new Scanner(System.in);

    while (true) {
      int A = input.nextInt();
      int B = input.nextInt();
      if (A == 0 && B == 0) {
        input.close();
        break;
      } else
        System.out.println(A+B);
    }

  }

  /**
   *  백준 2739
   *   - 구구단   */
  public void multiplicationTable() {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    input.close();

    int limit = 9;
    for (int i=1; i<= limit; i++) {
      System.out.println(N + " * " + i + " = " + N*i);
    }
  }

  /**
   *  백준 2438
   *   - 별 찍기 -1
   */
  public void starMark() {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    input.close();

    for (int i=0; i< N; i++) {
      for (int j=0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /**
   *  백준 10951
   *   - A+B-4
   *   - hasNextInt : 입력값이 정수일 경우 true / 정수 아닐 경우 예외 false
   */
  public void AB4() {
    Scanner input = new Scanner(System.in);

    while (input.hasNextInt()) {
      int A = input.nextInt();
      int B = input.nextInt();
        System.out.println(A+B);
    }
    input.close();
  }

}
