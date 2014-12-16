package hello;

import org.springframework.beans.factory.FactoryBean;


public class TestFactoryBean implements FactoryBean<TestFactory>{

    private String name;
    private TestFactory testFactory;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public TestFactory getObject() throws Exception {
        if (this.testFactory != null)
            return this.testFactory;

        this.testFactory = new TestFactoryImp();
        return this.testFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
