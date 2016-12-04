package com.zhuxt;

/**
 * 新生代Minor GC
 * VM ARGS: -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * Created by zhuxt on 16/12/3.
 */
public class TestAllocation {

    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
//        String s = new String("abc");
    }

    public static void main(String[] args) {
        TestAllocation allocation = new TestAllocation();
//        String a = new String("aa");
//        String b = "aa";
//        System.out.println(a);
//        System.out.println(b.getClass());
//        System.out.println(a == b);
//        System.out.println(a.intern() == b);
    }
}
