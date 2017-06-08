import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node<Object> node0 = new Node<Object>((Object) "CX>py*&iqz:ctm/u[AO");
      Node<Object> node1 = new Node<Object>((Object) "CX>py*&iqz:ctm/u[AO");
      node1.setNext(node0);
      assertFalse(node0.equals((Object)node1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node<String> node0 = new Node<String>((String) null);
      String string0 = node0.getObject();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Node<Integer> node0 = new Node<Integer>(integer0);
      node0.setNext(node0);
      Node<Integer> node1 = node0.getNext();
      assertSame(node0, node1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Node<Integer> node0 = new Node<Integer>(integer0);
      Node<Integer> node1 = node0.getNext();
      assertNull(node1);
  }

}

