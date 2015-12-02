import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class VerificadorDeNumeroFelizTest {

    @Test
    public void verificaQuebraDe10(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        int arrayRetorno[] = numeroFeliz.quebraNumero(10);
        assertEquals(1, arrayRetorno[0]);
        assertEquals(0, arrayRetorno[1]);
    }

    @Test
    public void deveSerFelizParaUm(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(1);
        assertTrue("1 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaSete(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(7);
        assertTrue("7 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaDez(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(10);
        assertTrue("10 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaQuarentaENove(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(49);
        assertTrue("49 deveria ser feliz", ehFeliz);
    }

    @Ignore
    public void deveSerInfelizParaDois(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehInfeliz = numeroFeliz.verificaNumeroFeliz(2);
        assertTrue("2 deveria ser infeliz", ehInfeliz);
    }

}