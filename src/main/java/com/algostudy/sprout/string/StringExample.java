package com.algostudy.sprout.string;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * packageName    : com.algostudy.string
 * fileName       : StringExample
 * author         : admin
 * date           : 2025-03-05-005
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-05-005        admin       최초 생성
 */
public class StringExample {

  /**
   *  백준 11654
   *   - 아스키 코드
   *   - charAt() : String으로 저장된 문자열 중에서 한글자만 선택해서 char 타입으로 변환
   *                charAt(0) => 0번째 있는 문자를 char 타입으로 변환
   */
  public void ASCII() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    int n = input.charAt(0);
    System.out.println(n);
  }

  /**
   *  백준 2743
   *   - 단어 길이 재기
   */
  public void wordLength() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    int leng = input.length();
    System.out.println(leng);
  }

  /**
   *  백준 2744
   *   - 대소문자 바꾸기
   */
  public void upperLowerCase() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    String result = "";
    for (int i=0; i<input.length(); i++) {
      char c = input.charAt(i);
      if (Character.isUpperCase(c)) {
        result += Character.toLowerCase(c);
      } else {
        result += Character.toUpperCase(c);
      }
    }
    System.out.println(result);
  }

  /**
   *  백준 2754
   *   - 학점계산
   */
  public void gradeCal() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    double grade = 0.0;
    char c = input.charAt(0);
    switch (c) {
      case 'A':
        grade = 4;
        break;
      case 'B':
        grade = 3;
        break;
      case 'C':
        grade = 2;
        break;
      case 'D':
        grade = 1;
        break;
      case 'F':
        break;
    }
    if (grade != 0.0) {
      c = input.charAt(1);
      if (c == '+') {
        grade += 0.3;
      } else if (c == '-') {
        grade -= 0.3;
      }
    }
    System.out.println(grade);
  }

  /**
   *  백준 27866
   *   - 문자와 문자열
   */
  public void charAndString() {
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int i = sc.nextInt();
    sc.close();

    char c = word.charAt(i-1);
    System.out.println(c);
  }

  /**
   *  백준 11718
   *   - 그대로 출력하기
   */
  public void printOrigin() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str;
    while((str = br.readLine()) != null) {
      bw.write(str + "\n");
      bw.flush();
    }

    br.close();
    bw.close();
  }

  /**
   *  백준 9086
   *   - 문자열
   *   - StringBuilder : 한 번에 저장해서 출력하기 위함
   */
  public void stringgg() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int caseCount = Integer.parseInt(str);

    StringBuilder sb = new StringBuilder();
    for (int i=0; i<caseCount; i++) {
      String input = br.readLine();
      char[] cInput = input.toCharArray();
      sb.append(cInput[0]).append(cInput[input.length() -1]).append("\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();

  }
}
