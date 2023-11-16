
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestCommission {
    @Mock
    private Lock lock = Mockito.mock(Lock.class);

    @Mock
    private Stock stock = Mockito.mock(Stock.class);

    @Mock
    private Barrel barrel = Mockito.mock(Barrel.class);

    @InjectMocks
    CalculateCommission c = new CalculateCommission();

    @Before

    public void Setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetCommissionSkipWhileLoop() {
    }

    @Test
    public void testGetCommissionEnterWhileLoop() {
        when(lock.getCount()).thenReturn(5);
        Lock l = spy(new Lock())
        CalculateCommission c = new CalculateCommission();
        double com = c.getCommission(, new Stock(5), new Barrel(5));
        Assert.assertEquals(520.0, com, 0);



    }
}