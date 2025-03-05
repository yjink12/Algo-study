package com.algostudy.sprout.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * packageName    : com.algostudy.func
 * fileName       : FuncExample
 * author         : admin
 * date           : 2025-03-05-005
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-05-005        admin       최초 생성
 */
public class FuncExample {
  /**
   *  백준 15964
   *   - 이상한 기호
   */
  public void strangeSymbol() {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();

    long result = (A+B)*(A-B);
    System.out.println(result);
  }

  /**
   *  백준 2475
   *   - 검증수
   */
  public void verificationNumber() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    StringTokenizer st = new StringTokenizer(s);
    int sum = 0;
    for (int i=1; i<=5; i++) {
      int input = Integer.parseInt(st.nextToken());
      sum += input*input;
    }
    int result = sum%10;
    System.out.println(result);

    br.close();
  }
}
