import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
  
  @Test
  public void evaluatesExpression2() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("2+4+6");
    assertEquals(12, sum);
  }
  
  //this test is built to fail
  //@Test
  //public void purposelyWrongTest() {
    //Calculator calculator = new Calculator();
    //int sum = calculator.evaluate("1+2+3");
    //assertEquals(8, sum);
  //}
}