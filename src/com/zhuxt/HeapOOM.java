package com.zhuxt;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存OOM测试
 * VM Args:-Xms20m -Xmx20m
 * Created by zhuxt on 16/12/3.
 */
public class HeapOOM {

    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
