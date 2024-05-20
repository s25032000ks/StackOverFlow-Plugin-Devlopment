package com.example.demo;

import com.intellij.ide.BrowserUtil;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


public class AskQuestionAction extends AnAction {
    @Override
    public void actionPerformed( AnActionEvent event) {
        // Implement your action logic here
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }

}