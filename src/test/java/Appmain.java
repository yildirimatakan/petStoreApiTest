import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class Appmain {

    public static void main(String[] args){
        System.out.println("Hello MALATYA");
        TestNG runner = new TestNG();
        List<String> suiteFiles = new ArrayList<>();
        suiteFiles.add("testng.xml");
        runner.setTestSuites(suiteFiles);
        runner.run();
    }
}
