package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Fixture.class, TestAge.class, TestBio.class, TestName.class })
public class AllTests {

}
