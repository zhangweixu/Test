package com.zhang.Demo.operator;

// 逻辑运算符： 与  或   非
public class Demo05 {
    // 与（and）  或（or） 非（取反）
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        System.out.println("a&&b:"+(a&&b)); //逻辑与运算：两个变量都为真，则为真
        System.out.println("a||b:"+(a||b)); // 逻辑与运算：两个变量有一个为真则为真
        System.out.println("!(a&&b):"+(!a&&b));//如果是真则为假，如果为假则为真（取反）

        //短路运算
        int c=5;
        boolean d=(c<4)&&(c++<4);
        System.out.println(d);

    }

}
