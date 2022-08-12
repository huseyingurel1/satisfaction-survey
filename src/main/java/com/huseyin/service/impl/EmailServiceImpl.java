package com.huseyin.service.impl;


import com.huseyin.model.QuestionForm;
import com.huseyin.model.Result;
import com.huseyin.repository.ResultRepo;
import com.huseyin.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.security.Principal;


@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    Result result;
    @Autowired
    ResultRepo resultRepo;
    @Autowired
    ResultServiceImpl resultService;

    @Autowired
    QuestionForm qForm;

    public String sendEmail(Principal principal) {

        if(principal.getName() == "admin"){

            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom("huseyingurel27@gmail.com");
            message.setTo("huseyingurel27@gmail.com");
            message.setSubject("Survey Results");
            message.setText("Admin olarak giriş yaptınız. Mail Yönlendirme Başarılı ");

            javaMailSender.send(message);

            return "Mail sent successfully";


        }else {
            Result result1 = resultRepo.findByEmail(principal.getName());

            result1.setSatisfaction(resultService.getResultSatisfaction(qForm));


            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom("huseyingurel27@gmail.com");
            message.setTo(principal.getName());
            message.setSubject("Survey Results");
            message.setText("Dear  "+result1.getUsername()+"\n"+
                    "\n" +
                    " \n Thank you for taking the time to complete this survey.\n " +
                    "We truly value the information you have provided.\n" +
                    " Your responses will contribute to our analyses of the \n " +
                    "texts and suggest new lines of approach to the corpus data."+
                    "\n"+
                    "\n"+" Best Regards "+
                    "\n"+"Java Developer Hüseyin Gürel"
            );

            javaMailSender.send(message);

            return "Mail sent successfully";
        }
    }


}
