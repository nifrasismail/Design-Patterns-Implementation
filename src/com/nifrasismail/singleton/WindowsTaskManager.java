package com.nifrasismail.singleton;

public class WindowsTaskManager {

    private static WindowsTaskManager windowsTaskManager = new WindowsTaskManager();

    private WindowsTaskManager() {
    }

    public static WindowsTaskManager getWindowsTaskManager() {
        return windowsTaskManager;
    }

    public void startTaskManager() {
        System.out.println("Task Manager 101 OPEN");
    }
}
