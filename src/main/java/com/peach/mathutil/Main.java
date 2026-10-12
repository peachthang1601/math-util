package com.peach.mathutil;

import com.peach.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //tdd - VIẾT CODE BẮT ĐẦU TỪ TEST
    }
    public static void testFactorialGivenValidN5ReturnsWell120(){
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        System.out.println("check 5 : | expected "
                + expected + " | actual : " + actual );
    }
}
// code NÀY DÙNG ĐỂ TEST CODE CHÍNH
