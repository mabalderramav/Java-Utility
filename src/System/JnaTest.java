package System;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.User32;

public class JnaTest {

    public static void main(String[] args) {
        System.out.println("title is " + getActiveWindowTitle());
    }

    private static String getActiveWindowTitle() {
        HWND fgWindow = User32.INSTANCE.GetForegroundWindow();
        int titleLength = User32.INSTANCE.GetWindowTextLength(fgWindow) + 1;
        char[] title = new char[titleLength];
        User32.INSTANCE.GetWindowText(fgWindow, title, titleLength);
        return Native.toString(title);
    }

}