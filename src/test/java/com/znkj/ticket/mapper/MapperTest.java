package com.znkj.ticket.mapper;

import com.znkj.ticket.Application;
import com.znkj.ticket.model.Admin;
import com.znkj.ticket.model.MovieTimes;
import com.znkj.ticket.util.IdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

/**
 * @author liuzh
 * @since 2016-03-06 17:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@Transactional
@SpringBootTest(classes = Application.class)
public class MapperTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private MovieTimesMapper movieTimesMapper;

    private static IdUtil idUtil = IdUtil.getInstance();

    @Test
    public void intIdSave() throws Exception {
        Admin admin = new Admin();
        //admin.setId(101);
        admin.setUsername("dddddd");
        admin.setPassword("123456");
        admin.setAddtime(new Date());
        admin.setUpdatetime(new Date());
        admin.setAdder(1);
        int insertId = adminMapper.insert(admin);
        logger.info("{}", admin);

    }

    @Test
    public void stringIdSave() throws Exception {
        MovieTimes movieTimes = new MovieTimes();
        movieTimes.setId(idUtil.getNewId());
        movieTimes.setAdder(123);
        movieTimes.setAddtime(new Date());
        movieTimes.setUpdatetime(new Date());
        movieTimes.setDuration(120);
        movieTimes.setHallId("dasdasdsadsads");
        movieTimes.setMovieId("xxxxxxxxxxxxxx");
        movieTimes.setTempId("hhhhhhhhhhhhh");
        movieTimes.setTheatreId("kkkkkkkkkkk");
        movieTimes.setStarttime(new Date());

        movieTimesMapper.insert(movieTimes);
        logger.info("{}", movieTimes);
    }

    @Test
    public void select() throws Exception {
        List<Admin> list = adminMapper.selectAll();
        logger.info("{}", list);
    }


}
