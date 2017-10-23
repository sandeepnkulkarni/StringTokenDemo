package local.snk;

import java.util.List;
import org.apache.commons.lang3.text.*;

public class StringTokenDemo {

	/**
	 * This is main method.
	 * It uses StrTokenizer from org.apache.commons.lang3.text to split input string based on delimiter
	 * and prints token list on console.
	 * @param args	Input argument for the program.
	 */
    public static void main(String[] args) {
        String test = "pdf, doc, html";
	    List<String> tokens = new StrTokenizer(test, ",").setTrimmerMatcher(StrMatcher.spaceMatcher()).getTokenList();
	    for (String token : tokens)
        {
            System.out.printf("[%s]\n", token);
        }
	    
	    TestFun();
    }
    
    /**
     * Test function which print 'Test Function' on console.
     * @return	void
     */
    private static void TestFun()
    {
    	System.out.printf("Test Function\n");
    }

}
