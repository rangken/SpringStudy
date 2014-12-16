package hello;

/**
 * Created by Rangken on 14. 12. 4..
 */
public class TestFactoryImp implements TestFactory{

    @Override
    public void hello(String name) {
        System.out.println("Test Factory hello " + name);
    }
}
