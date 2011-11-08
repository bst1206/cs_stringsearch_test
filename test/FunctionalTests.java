import com.eaio.stringsearch.*;

/**
 * This is the entry point for Part 1: Functional tests
 */
public class FunctionalTests {


    public static void main(String[] args) {

        // Test case 1 - given
        test1();

        // generated test cases - 20 test cases in total
        test2();
        test3();
        test4();
        test5();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
        test16();
        test17();
        test18();
        test19();
        test20();
        test21();


        System.out.println("Tests completed successfully.");
    }

    static void test1() {
        // Technique used: Equivalence Partitioning.

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern is NOT found in the string.

        StringSearch ss = new BNDM();
        String str = "helloworld";
        String pattern = "se6367";

        int location = ss.searchString(str, pattern);

        Assert.assertEquals(-1, location);
    }

    static void test2() {
        // Technique uesd: Equivalence Partitioning and Boundary Value Analysis

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern is found in the string at the beginning.

        StringSearch ss = new BNDM();
        String str = "helloworldexample";
        String pattern = "hello";

        int location = ss.searchString(str, pattern);

        Assert.assertEquals(0, location);
    }

    static void test3() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern is found in the string after 0 (inside of the string).

        StringSearch ss = new BNDM();
        String str = "helloworld";
        String pattern = "owo";

        int location = ss.searchString(str, pattern);

        Assert.assertEquals(4, location);
    }

    static void test4() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a null string
        //  - expecting NullPointerException error (as an oracle myself, I think it should say -1)

        // NOTE: I am not sure which one will be more helpful. Should the searchString be checking for null and return -1? or should it simply throw NullPointerException?

        StringSearch ss = new BNDM();
        String str = null;
        String pattern = "awe";

        int location;

        try{
            location = ss.searchString(str, pattern);
            Assert.assertEquals(-1, location);
        }
        catch (NullPointerException npe){
            Assert.assertIsTrue(true, npe.getMessage());
        }

    }

    static void test5() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a null pattern
        //  - a non-null string
        //  - expecting error

        // NOTE: I am not sure which one will be more helpful. Should the searchString be checking for null and return -1? or should it simply throw NullPointerException?

        StringSearch ss = new BNDM();
        String str = "catdog";
        String pattern = null;

        int location;

        try{
            location = ss.searchString(str, pattern);
            Assert.assertEquals(-1, location);
        }
        catch (NullPointerException npe){
            Assert.assertIsTrue(true, npe.getMessage());
        }

    }

    static void test6() {
        // Technique uesd: Equivalence Partitioning and Boundary Value Analysis

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a emppty string

        StringSearch ss = new BNDM();
        String str = "s";
        String pattern = "nonnull";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);

    }

    static void test7() {
        // Technique uesd: Equivalence Partitioning and Boundary Value Analysis

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a empty pattern
        //  - a non-null string
        //  - throws an exception, while it could just return -1, or even -2 (for distinction between simply couldn't find it)

        StringSearch ss = new BNDM();
        String str = "nonnullstring";
        String pattern = "";

        int location;
        try{
            location = ss.searchString(str, pattern);
            Assert.assertEquals(-1, location);
        }
        catch(NegativeArraySizeException nase)
        {
            Assert.assertIsTrue(true, nase.getMessage());
        }

    }

    static void test8() {
        // Technique uesd: Equivalence Partitioning and Boundary Value Analysis

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null, yet only null character pattern
        //  - a non-null string

        StringSearch ss = new BNDM();
        String str = "theothernonnullString";
        String pattern = "\0";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);

    }

    static void test9() {
        // Technique uesd: Equivalence Partitioning and Boundary Value Analysis

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a empty pattern
        //  - a empty string

        StringSearch ss = new BNDM();
        String str = "";
        String pattern = "";

        int location;
        try{
            location = ss.searchString(str, pattern);
            Assert.assertEquals(-1, location);
        }
        catch(NegativeArraySizeException nase)
        {
            Assert.assertIsTrue(true, nase.getMessage());
        }

    }

    static void test10() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null, yet only null character string

        StringSearch ss = new BNDM();
        String str = "\0";
        String pattern = "theothernonnullPattern";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);

    }
    static void test11() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null, yet contains null character string
        //  - pattern is not found in the string

        StringSearch ss = new BNDM();
        String str = "not\0found";
        String pattern = "notfound";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);

    }

    static void test12() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null, yet only null character pattern
        //  - a non-null string
        //  - the pattern is not found in the string

        StringSearch ss = new BNDM();
        String str = "isfoundstring";
        String pattern = "found\0str";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);

    }

    static void test13() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null, yet only null character pattern
        //  - a non-null string
        //  - the pattern, is found in the string

        StringSearch ss = new BNDM();
        String str = "isfound\0patternString2";
        String pattern = "found\0pattern";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(2, location);

    }

    static void test14() {
        // Technique uesd: Boundary Value Analysis

        // This test case represents the Boundary Value Analysis of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a long string
        //  - the pattern is found in the string

        StringSearch ss = new BNDM();
        String pattern = "pattern";
        String str = "reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeallylongstringwithpattern";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(55, location);
    }

    static void test15() {
        // Technique uesd: Boundary Value Analysis

        // This test case represents the Boundary Value Analysis of test inputs
        // to the BNDM implementation of StringSearch.searchString that contain:

        //  - a long pattern
        //  - a non-null string
        //  - the pattern is found in the string

        StringSearch ss = new BNDM();
        String pattern = "reaallallalaaaaaaaaaaaaaaaaaaaaaallllllllly long pattern";
        String str = "aaa";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(-1, location);
    }

    static void test16() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDMCI implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern, if case is ignored, is found in the string

        StringSearch ss = new BNDMCI();
        String pattern = "sEnSiTiVE";
        String str = "CAseInsenSitive";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(6, location);
    }

    static void test17() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDMWildcards implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern, if default wildcard used, is found in the string

        StringSearch ss = new BNDMWildcards();
        String pattern = "se.n";
        String str = "caseInsensitive";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(2, location);
    }

    static void test18() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDMWildcards implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern, if set wildcard used, is found in the string

        StringSearch ss = new BNDMWildcards('s');
        String pattern = "sesn";
        String str = "pennstate";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(0, location);
    }

    static void test19() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDMWildcardsCI implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern, if default wildcard used, is found in the string

        StringSearch ss = new BNDMWildcardsCI();
        String pattern = ".w.t.f";
        String str = "NemoWithFin";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(3, location);
    }

    static void test20() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the BNDMWildcardsCI implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern, if set wildcard used, is found in the string

        StringSearch ss = new BNDMWildcardsCI('9');
        String pattern = "a9d9b9";
        String str = "acdebfc";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(0, location);
    }

    static void test21() {
        // Technique uesd: Equivalence Partitioning

        // This test case represents the equivalence class of test inputs
        // to the ShiftOrMismatches implementation of StringSearch.searchString that contain:

        //  - a non-null pattern
        //  - a non-null string
        //  - the pattern is length 5 ( much less then length 10) and only contain 2 mismatches. So it should find with mismatch.

        StringSearch ss = new ShiftOrMismatches();
        String pattern = "mas";
        String str = "mismatchingthisstring";

        int location = ss.searchString(str, pattern);
        Assert.assertEquals(0, location);
    }
}
