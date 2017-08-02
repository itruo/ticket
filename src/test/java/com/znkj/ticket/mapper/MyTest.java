import com.znkj.ticket.enums.ResultEnum;
import com.znkj.ticket.util.ResultVo;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuzh
 * @since 2016-03-06 17:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void json() throws Exception {
        ResultVo resultVo = new ResultVo(ResultEnum.SUCCESS);
        logger.error(resultVo.toJson());

    }
}
