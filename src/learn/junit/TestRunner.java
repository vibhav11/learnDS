package learn.junit;

import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Iterator;

public class TestRunner {
    public static void main(String[] args) {

        TestSuite suite = new TestSuite(TestJunit.class, TestValidPalindrome.class, TestRemoveDuplicates.class);
        //Result result = JUnitCore.runClasses(TestJunit.class);
        TestResult result = new TestResult();
        suite.run(result);

       /* for (Failure failure : result.failures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());*/

        resultReport(result);
    }

    public static void resultReport(TestResult result) {
        System.out.println(result.failures().toString());
        Iterator<TestFailure> iterator = result.failures().asIterator();
        iterator.forEachRemaining(i -> {
            System.out.println(i.toString());
        });


        System.out.println("--------------------REPORT-------------");
        System.out.println("Result: \n Failures: " +
                result.failureCount() + ". \n Tests run: " +
                result.runCount() + ". \n Time: ");
        System.out.println("--------------------XXX-------------");
    }

    /*public static void resultReport(Result result) {
        System.out.println("--------------------REPORT-------------");
        System.out.println("Result: \n Failures: " +
                result.getFailureCount() + ". \n Ignored: " +
                result.getIgnoreCount() + ". \n Tests run: " +
                result.getRunCount() + ". \n Time: " +
                result.getRunTime() + "ms.");
        System.out.println("--------------------XXX-------------");
    }*/
}
