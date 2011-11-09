import com.eaio.stringsearch.*;

/**
 * This is the entry point for Part 2, Coverage-enhanced tests.
 */
public class CoverageTests {

    public static void main(String[] args) {
        FunctionalTests.main(args);

        // Start adding additional tests here, below this line.

        //BNDM coverage
        coverage_bndm();
        //BNDMCI coverage
        coverage_bndmci();
        //BNDMWildcards coverage
        coverage_bndmwildcards();
    }

    static void coverage_bndm()
    {
        StringSearch bndm = new BNDM();
        byte[] bndmByteText;
        byte[] bndmBytePattern;

        //coverage 1
        bndmByteText = new byte[1];
        bndmByteText[0] = 'a';
        bndmBytePattern = new byte[1];
        bndmBytePattern[0] = 'b';
        bndm.searchBytes(bndmByteText, bndmBytePattern);

        //coverage 2
        bndmByteText = new byte[2];
        bndmByteText[0] = 'a';
        bndmByteText[1] = 'b';
        bndmBytePattern = new byte[1];
        bndmBytePattern[0] = 'b';
        bndm.searchBytes(bndmByteText, bndmBytePattern);

        //coverage 3
        bndmByteText = new byte[2];
        bndmByteText[0] = 'a';
        bndmByteText[1] = 'b';
        bndmBytePattern = new byte[2];
        bndmBytePattern[0] = 'a';
        bndmBytePattern[0] = 'b';
        bndm.searchBytes(bndmByteText, bndmBytePattern);
    }

    static void coverage_bndmci()
    {
        StringSearch bndmci = new BNDMCI();
        byte[] bndmciByteText;
        byte[] bndmciBytePattern;
        String bndmciText;
        String bndmciPattern;

        //coverage 1
        bndmciText = "123456789";
        bndmciPattern = "4567";
        bndmci.searchString(bndmciText, bndmciPattern) ;

        //coverage 2
        bndmciBytePattern = new byte[236];
        bndmciBytePattern[0] = '1';
        bndmciBytePattern[1] = 'b';
        bndmciBytePattern[2] = 'J';
        bndmciBytePattern[3] = (byte)200;
        bndmciBytePattern[4] = (byte)200;
        bndmci.processBytes(bndmciBytePattern);

        //coverage 3
        bndmciBytePattern = new byte[32];
        for(int i = 0 ; i < 32; ++i)
        {
            bndmciBytePattern[i] = (byte)(i+200);
        }
        bndmci.processBytes(bndmciBytePattern);
    }

    static void coverage_bndmwildcards()
    {
        StringSearch bndmwc = new BNDMWildcards();
        byte[] bndmwcByteText;
        byte[] bndmwcBytePattern;
        String bndmwcText;
        String bndmwcPattern;

        //coverage 1
        bndmwcByteText = new byte[3];
        bndmwcByteText[0] = 'w';
        bndmwcByteText[1] = 'd';
        bndmwcByteText[2] = 'c';
        bndmwcBytePattern = new byte[2];
        bndmwcBytePattern[0] = 'd';
        bndmwcBytePattern[1] = '.';
        bndmwc.searchBytes(bndmwcByteText, bndmwcBytePattern);

        BNDMWildcards _bndmwc = new BNDMWildcards();
        _bndmwc.processString("bndmwildcard", 'w');
    }

}
