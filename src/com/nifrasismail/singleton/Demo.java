package com.nifrasismail.singleton;

public class Demo {
    public static void main(String[] args) {
        //Only a object can open, not able to create different objects of task manger
        WindowsTaskManager windowsTaskManager = WindowsTaskManager.getWindowsTaskManager();
        windowsTaskManager.startTaskManager();
    }
}
