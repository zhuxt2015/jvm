package com.zhuxt;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常
 * VM Args:-XX:PermSize=10m -XX:MaxPermSize=10m
 * Created by zhuxt on 16/12/3.
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        //适用list保持着常量池引用, 避免Full GC回收常量池行为
        List<String> list = new ArrayList<>();
        //10M的PermSize在Integer范围内足够产生OOM
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }

    }
}
