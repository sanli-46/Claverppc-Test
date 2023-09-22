package StepDefinitions;

import Utilitys.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before(){//Cucummber ın Annotation ı

    }
    @After
    public void after(){//Cucummber ın Annotation ı
        GWD.quitDriver();
    }
}
