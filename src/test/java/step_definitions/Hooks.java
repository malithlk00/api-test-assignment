package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void initializeTest(){
        Properties props = System.getProperties();
        try {
            FileInputStream in = new FileInputStream(System.getProperty("user.dir")
                    + File.separator + "src/main/resources" + File.separator + "testdata.properties");
            props.load(in);
            LOG.info("loading the properties file.....");
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @After
    public void tearDownTest(Scenario scenario) {

    }
}
