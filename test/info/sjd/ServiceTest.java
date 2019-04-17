package info.sjd;

import info.sjd.model.Result;
import info.sjd.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class ServiceTest {

    @Test
    public void testGetProfit1() {

        int[] arrayExample = {9,10,5,44,6,44,2,8,2};

        Result resultExample = new Result(2,5, 44, 3, 39);
//        resultExample.setValue(5);
//        resultExample.setIndex(2);
//        resultExample.setMaxForThisValue(44);
//        resultExample.setMaxForThisIndex(3);
//        resultExample.setProfit(39);

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
    public void testGetProfit2() throws Exception {
        int[] arrayExample = {9};

        Result result = new Result();
        Service service = new Service();
        try {
            result = service.getProfit(arrayExample);
            Assert.fail("Expected custom Exception");
        } catch (Exception thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}
