package info.sjd;

import info.sjd.model.Result;
import info.sjd.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class ServiceTest {

    private final String EXCEPTION_TO_EXAMPLE = "Profit is not found (there is less then two elements in array)";
    private final String EXCEPTION_NULL = "";

    @Test
    public void testGetProfit1() {

        int[] arrayExample = {9,10,5,44,6,44,2,8,2};

        Result resultExample = new Result();
        resultExample.setValue(5);
        resultExample.setIndex(2);
        resultExample.setMaxForThisValue(44);
        resultExample.setMaxForThisIndex(3);
        resultExample.setProfit(39);

        Result result = new Result();
        Service service = new Service();
        try {
            result = service.getProfit(arrayExample);
        } catch (Exception e) {
            log.info(String.format("Error: [%s].", e.getMessage())); //Not in use for this testcase
        }
        Assert.assertNotNull(result);
        Assert.assertEquals(result, resultExample);
    }

    @Test
    public void testGetProfit2() {
        int[] arrayExample = {9};

        Service service = new Service();
        try {
            service.getProfit(arrayExample);
            Assert.fail("Expected custom Exception. Test must fail for this testcase");
        } catch (Exception thrown) {
            Assert.assertNotNull(thrown.getMessage());
            Assert.assertEquals(EXCEPTION_TO_EXAMPLE, thrown.getMessage());
            Assert.assertNotEquals(EXCEPTION_NULL, thrown.getMessage());
        }
    }
}
