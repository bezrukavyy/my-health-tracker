package myhealthservices.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Set;

/**
 * Created by Gene Bezrukavyy on 10/23/16.
 */
@Controller
public class ApplicationController
{
    Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @RequestMapping("/status")
    public String status() {

        String viewName = "ok";
        logger.info("resolved view: {}", viewName);
        return viewName;
    }

    @RequestMapping("/callback")
    public String callback(WebRequest request) {

        logger.info("####### Request Info: ###############");
        Set<String> requestParamKeyset = request.getParameterMap().keySet();

        for (String requestKey : requestParamKeyset) {

            logger.info("{} : {}", requestKey, request.getParameter(requestKey));
        }

        return "ok";
    }
}
