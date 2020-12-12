package org.saltedfish.thread.basicusageofthreads;

/**
 * Java线程优先级
 * 默认为5 数字越大优先级越高
 * 【1，10】
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println("Defalut Priority:" + thread.getPriority());
        thread.setPriority(6);
        System.out.println("Modify Priority:" + thread.getPriority());
    }
}
