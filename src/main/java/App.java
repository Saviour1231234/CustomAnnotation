/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import annotation.TestAnnotationAnalyzer;
import app.User;

public class App {
    public static void main(String[] args) {
        TestAnnotationAnalyzer testAnnotationAnalyzer =  new TestAnnotationAnalyzer();
        testAnnotationAnalyzer.analyze(User.class);
    }
}
