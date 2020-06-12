package com.dwsoft.springcloud.study.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tlk
 * @date 2020/6/11-14:56
 */
@Component
public class MyZuulFilter extends ZuulFilter{
    Logger logger= LoggerFactory.getLogger(MyZuulFilter.class);
    @Override
    public String filterType() {
        String  type="pre";
        logger.info("================1");
        return type;
    }

    @Override
    public int filterOrder() {
        logger.info("=================0");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        logger.info("=============2");
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String empId = request.getParameter("empId");
        if("222".equals(empId))return true;
        return false;
    }

    @Override
    public Object run()  {
        logger.info("=================3");
        return null;
    }
}
