package com.algostudy.sprout.array;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * packageName    : com.algostudy.array
 * fileName       : ArrayExample
 * author         : admin
 * date           : 2025-03-05-005
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-05-005        admin       최초 생성
 */
public class ArrayExample {
  /**
   *  백준 10871
   *   - X 보다 작은 수
   *   - StringTokenizer : 특정 문자에 따라 문자열을 나누고 싶을 때 사용
   */
  public void Xsmaller() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    String seq = br.readLine();
    String[] arr = seq.split(" ");

    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(arr[i]) < X) {
        bw.write(arr[i] + " ");
      }
    }
    br.close();
    bw.flush();
    bw.close();

  }

  /**
   *  백준 10807
   *   - 개수 세기
   */
  public void count() {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] arr = new int[N];
    for (int i=0; i<N; i++) {
      arr[i] = sc.nextInt();
    }
    int v = sc.nextInt();
    sc.close();

    int count = 0;
    for (int ar: arr) {
      if (ar == v) {
        count++;
      }
    }
    System.out.println(count);
  }

  /**
   *  백준 5597
   *   - 과제 안 내신 분...?
   */
  public void homeworkNotYet() throws IOException {
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[31];
    for (int i=1; i<=28; i++) {
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s);
      int input = Integer.parseInt(st.nextToken());
      arr[input] = 1;
    }

    for (int j=1; j<=30; j++) {
      if (arr[j] == 0) {
        bw.write(j + "\n");
      }
    }
    br.close();
    bw.flush();
    bw.close();
  }

  /**
   *  백준 2738
   *   - 행렬 덧셈
   */
  public void matrixAddition() throws IOException {
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();
    StringTokenizer st = new StringTokenizer(s);
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[][] arr = new int[N][M];

    for (int i=0; i<N; i++) {
      String sf = br.readLine();
      st = new StringTokenizer(sf);
      for (int j=0; j<M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i=0; i<N; i++) {
      String ss = br.readLine();
      st = new StringTokenizer(ss);
      for (int j=0; j<M; j++) {
        int input = Integer.parseInt(st.nextToken());
        bw.write(arr[i][j] + input + " ");
      }
      bw.write("\n");
    }

    br.close();
    bw.flush(); // 버퍼 안에 저장되어 있는 모든 문자열 출력
    bw.close();
  }
}
