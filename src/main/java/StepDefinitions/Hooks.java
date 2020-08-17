package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@dummyLogin")
    public void init()
    {
        System.out.println("--xxxxxx--inside before annotation--xxxxxx--");
    }


    @After("@dummyLogin")
    public  void  afterScenario()
    {
        System.out.println("--xxxxxx--Closer the browser--xxxxxx--");
    }

}
