package com.algostudy.sprout.Io;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.algostudy.Io
 * fileName       : IOExample
 * author         : admin
 * date           : 2025-03-04-004
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-04-004        admin       최초 생성
 */
public class IOExample {

  /**
   *  백준 15552
   *   - 빠른 A+B
   *   - 입출력 방식이 느리면 시간초과가 날 수 있음
   *      => BufferedReader와 BufferedWriter 사용
   *         BufferedWriter.flush는 맨 마지막에 한 번 실행
   */

  public void IOAB() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str= br.readLine();
    int T = Integer.parseInt(str);
    int[] arr = new int[T];

    for (int i=0; i<T; i++) {
      String AB = br.readLine();
      StringTokenizer st = new StringTokenizer(AB);
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      arr[i] = A+B;
    }

    for (int ar: arr) {
      bw.write(ar + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
