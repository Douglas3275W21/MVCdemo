package com.testmvc.demomvc;

import org.springframework.stereotype.Component;

@Component
public class TestModel {
    private String testText;
    private String testText2;

    public TestModel () {
    }

    public TestModel (String testText, String testText2) {
        this.testText = testText;
        this.testText2 = testText2;
    }

    public String getTestText () {
        return testText;
    }

    public void setTestText (String testText) {
        this.testText = testText;
    }

    public String getTestText2 () {
        return testText2;
    }

    public void setTestText2 (String testText2) {
        this.testText2 = testText2;
    }
}
