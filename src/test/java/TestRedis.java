import cn.lifecycle.SpringBootLearnApplication;
import cn.lifecycle.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLearnApplication.class)
public class TestRedis {

private static  final Logger logger = LoggerFactory.getLogger(TestRedis.class);

    @Test
    public void testRedis() {
        User user = new User();
        user.setAge(11);
        user.setName("yyy");
        user.setId(0);
        logger.info("**************日志测试****************");
System.out.println("+++++++++"+user.getName());
    }
}
