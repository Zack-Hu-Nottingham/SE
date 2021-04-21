import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class BoCTransactionTest {

    // Author: Leshan Tan
    // Last Modified: 2021/4/18
    @Test
    void BoCTransaction() throws NoSuchFieldException, IllegalAccessException{
        final BoCTransaction boc = new BoCTransaction();
        final Field fieldName = boc.getClass().getDeclaredField("transactionName");
        final Field fieldValue = boc.getClass().getDeclaredField("transactionValue");
        final Field fieldCategory = boc.getClass().getDeclaredField("transactionCategory");
        final Field fieldTime = boc.getClass().getDeclaredField("transactionTime");
        fieldName.setAccessible(true);
        fieldValue.setAccessible(true);
        fieldCategory.setAccessible(true);
        fieldTime.setAccessible(true);
        assertEquals("[Pending Transaction]", fieldName.get(boc),"Field transactionName didn't match");
        assertNull( fieldValue.get(boc),"Field transactionValue didn't match");
        assertEquals(0, fieldCategory.get(boc),"Field transactionCategory didn't match");
        assertNull(fieldTime.get(boc),"Field transactionTime didn't match");
    }

    @Test
    void transactionName() {
    }

    // Author: Leshan Tan
    // Last Modified: 2021/4/21
    @ParameterizedTest
    @CsvFileSource(resources = {"transactionValue.csv"})
    void transactionValue(String input, String expectation) throws  NoSuchFieldException, IllegalAccessException{
        final BoCTransaction boc = new BoCTransaction();
        final Field fieldValue = boc.getClass().getDeclaredField("transactionValue");
        fieldValue.setAccessible(true);
        fieldValue.set(boc, new BigDecimal(input));
        final BigDecimal result = boc.transactionValue();
        assertEquals( new BigDecimal(expectation), boc.transactionValue(), "Field transactionValue wasn't retrieved properly");
    }

    @Test
    void transactionCategory() {
    }

    @Test
    void transactionTime() {
    }

    @Test
    void setTransactionName() {
    }

    @Test
    void setTransactionValue() {
    }

    @Test
    void setTransactionCategory() {
    }

    @Test
    void setTransactionTime() {
    }

    @Test
    void testToString() {
    }
}