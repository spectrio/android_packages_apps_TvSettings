package com.android.tv.settings.connectivity.setup;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class HwKeyboardFixer {
    public static void setupHwEnterAsImeActionNext(EditText textInput) {
        if (textInput != null) {
            textInput.setOnKeyListener((v, keyCode, event) -> {
                if(event != null && event.getKeyCode() == KeyEvent.KEYCODE_ENTER
                        && event.getAction() == KeyEvent.ACTION_DOWN) {
                    textInput.onEditorAction(EditorInfo.IME_ACTION_NEXT);
                }
                return false;
            });
        }
    }
}
