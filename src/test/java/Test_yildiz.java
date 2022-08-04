
import buraii.yildiz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_yildiz {
    private buraii.yildiz yildiz=new yildiz();
    @Test
    public void negatifGirdim(){

        assertEquals("pozitifff olsun",yildiz.yildizlar("-5"));
    }
    @Test
    public void yararmiQİse(){

        assertEquals("bb",yildiz.qİseCik("q"));
    }

    @Test //2 layer test
    public void testYildizlar2() {
        Assert.assertEquals("  *\n ***\n",yildiz.yildizlar("2"));
    }
}
