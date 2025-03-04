package com.algostudy.test;

import com.algostudy.Io.IOExample;
import com.algostudy.condition.ConditionExample;
import com.algostudy.recursion.RecursionExample;
import com.algostudy.repetition.RepetitionExample;

import java.io.IOException;

/**
 * packageName    : com.algostudy.main
 * fileName       : Main
 * author         : admin
 * date           : 2024-10-14-014
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-14-014        admin       최초 생성
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // 순환
//        RecursionExample recursionExample = new RecursionExample();
//        recursionExample.sprout();

        /* 1. solved.ac 새싹 */
        // 조건
        ConditionExample conditionExample = new ConditionExample();
//        conditionExample.comparison();
//        conditionExample.examResult();
//        conditionExample.quadrant();
//        conditionExample.leapYear();
//        conditionExample.safariWorld();

        // 반복
        RepetitionExample repetitionExample = new RepetitionExample();
//        repetitionExample.nmark();
//        repetitionExample.factorial();
//        repetitionExample.AB3();
//        repetitionExample.AB5();
//        repetitionExample.multiplicationTable();
//        repetitionExample.starMark();
//        repetitionExample.AB4();

        // 빠른 입출력
        IOExample ioExample = new IOExample();
        ioExample.IOAB();
    }
}
