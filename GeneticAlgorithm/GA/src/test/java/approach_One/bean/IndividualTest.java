package approach_One.bean;

import approach_One.func.IndividualFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author vaibhavi
 * @project GA
 */

public class IndividualTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        IndividualFactory IF = new IndividualFactory();
        Individual i1 = IF.getIndividual();
        int[][] data = i1.getPhenotype().clone();
        Individual i2 = (Individual) i1.clone();
        i1.mutation();
        assertArrayEquals(i2.getPhenotype(), data);
    }
}
