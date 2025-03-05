package com.algostudy.test;

import com.algostudy.sprout.Io.IOExample;
import com.algostudy.sprout.array.ArrayExample;
import com.algostudy.sprout.condition.ConditionExample;
import com.algostudy.sprout.func.FuncExample;
import com.algostudy.sprout.repetition.RepetitionExample;
import com.algostudy.sprout.string.StringExample;

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
//        ioExample.IOAB();

        // 배열
        ArrayExample arrayExample = new ArrayExample();
//        arrayExample.Xsmaller();
//        arrayExample.count();
//        arrayExample.homeworkNotYet();
//        arrayExample.matrixAddition();

        // 문자열
        StringExample stringExample = new StringExample();
//        stringExample.ASCII();
//        stringExample.wordLength();
//        stringExample.wordLength();
//        stringExample.upperLowerCase();
//        stringExample.gradeCal();
//        stringExample.charAndString();
//        stringExample.printOrigin();
        stringExample.stringgg();

        // 함수
        FuncExample funcExample = new FuncExample();
//        funcExample.strangeSymbol();
//        funcExample.verificationNumber();

    }
}
