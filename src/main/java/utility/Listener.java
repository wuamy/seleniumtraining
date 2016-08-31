package utility;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;


/**
 * Created by amy on 8/31/2016.
 */
public class Listener implements ITestListener, ISuiteListener, IInvokedMethodListener {

    //This belongs to ISuiteListener and will execute before the Suite start
    @Override
    public void onStart(ISuite arg0){
        Reporter.log("About to begin executing Suite " + arg0.getName(), true);
    }

    //This belongs to ISuiteListener and will execute, once the suite is finished
    @Override
    public void onFinish(ISuite arg0) {
        Reporter.log("About ot end executing Suite " + arg0.getName(), true);
    }

    //This belongs ot ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg0) {
        Reporter.log("About to begin executing Test " + arg0.getName(), true);
    }

    // This belongs to ITestListener and will execute, once the Test set/batch is finished
    public void onFinish(ITestContext arg0) {
        Reporter.log("Completed executing test " + arg0.getName(), true);
    }

    //This belongs to ITestListener and will execute only when the test is pass
    public void onTestSuccess(ITestResult arg0) {
        //This is calling the printTestResults method
        printTestResults(arg0);
    }

    // This belongs to ITestListener and will execute only on the event of fail test

    public void onTestFailure(ITestResult arg0) {
        // This is calling the printTestResults method
        printTestResults(arg0);
    }

    // This belongs to ITestListener and will execute before the main test start (@Test)

    public void onTestStart(ITestResult arg0) {

        System.out.println("The execution of the main test starts now");

    }

    // This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped

    public void onTestSkipped(ITestResult arg0) {
        printTestResults(arg0);
    }

    // This is just a piece of shit, ignore this
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }

    //This is the method











}
