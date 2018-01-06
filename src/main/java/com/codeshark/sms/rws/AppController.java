package com.codeshark.sms.rws;


import com.codeshark.sms.SmsApplication;
import com.codeshark.sms.beans.ResponseObject;
import com.codeshark.sms.beans.SignInBean;
import com.codeshark.sms.commons.decorator.SMSDecorator;
import com.codeshark.sms.commons.enumeration.ReturnStatusEnum;
import com.codeshark.sms.commons.exception.GenericException;
import com.codeshark.sms.domain.User;
import com.codeshark.sms.rws.base.BaseRestfulWebService;
import com.codeshark.sms.service.IUserService;
import com.codeshark.sms.utill.DataBeanFactory;
import com.codeshark.sms.utill.DecoratorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/")
public class AppController extends BaseRestfulWebService {

    @Autowired
    private IUserService userService;

    @Autowired
    private DecoratorUtil decoratorUtil;

    @Autowired
    private DataBeanFactory dataBeanFactory;

    private static final Logger log = LoggerFactory.getLogger(AppController.class);

    @RequestMapping(value = "signIn", method = RequestMethod.POST)
    public @ResponseBody  ResponseObject driverSignUp(@RequestBody String json) {
       log.info("******Entering in signIn  with json "+ json + "******");
        long lStartTime = new Date().getTime();
        SMSDecorator decorator = new SMSDecorator();
//        try {
            SignInBean signInBean = (SignInBean) dataBeanFactory.populateDataBeanFromJSON(SignInBean.class, decorator, json);
            decorator.setDataBean(signInBean);

            if (decorator.getResponseMessage() == null || decorator.getResponseMessage().length() <= 0) {

            }
       /* } catch (GenericException e) {
            decorator.setResponseMessage(e.getMessage());
            decorator.setReturnCode(ReturnStatusEnum.FAILURE.getValue());
            log.info("******Exiting from driverSignUp  with json "+ json + "and exception "+e.getMessage()+"******");
        }*/
        decorator.setQueryTime((System.currentTimeMillis() - lStartTime) + "");

        return decoratorUtil.responseToClient(decorator);

    }
}
