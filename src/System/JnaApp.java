package System;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;

public class JnaApp {
    public static void main(String[] args) throws InterruptedException {
        for (int x = 0; x < 15; x++) {
            System.out.println("title is " + getActiveWindowTitle());
            Thread.sleep(4000);
        }
    }

    private static String getActiveWindowTitle() {
        HWND fgWindow = User32.INSTANCE.GetForegroundWindow();
        int titleLength = User32.INSTANCE.GetWindowTextLength(fgWindow) + 1;
        char[] title = new char[titleLength];
        User32.INSTANCE.GetWindowText(fgWindow, title, titleLength);
        return Native.toString(title);
    }
}