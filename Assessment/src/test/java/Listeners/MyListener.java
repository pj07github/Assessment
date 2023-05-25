package Listeners;

import Utilities.WebActions;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class MyListener implements ITestListener{

    public void onTestFailure(ITestResult result) {
        try {
            WebActions.captureScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
