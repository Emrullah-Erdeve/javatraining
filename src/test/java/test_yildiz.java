
import buraii.yildiz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_yildiz {
    private buraii.yildiz yildiz=new yildiz();
    @Test
    public void neagatifgirdim(){

        assertEquals("pozitifff olsun",yildiz.yildizlar("-5"));
    }
    @Test
    public void qiseyararmi(){

        assertEquals("bb",yildiz.qisecik("q"));
    }

    @Test //2 layer test
    public void testyildizlar2() {
        Assert.assertEquals("  *\n ***\n",yildiz.yildizlar("2"));
    }
}
