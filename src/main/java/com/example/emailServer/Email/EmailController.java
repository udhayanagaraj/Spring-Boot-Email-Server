package com.example.emailServer.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private EmailImpl email;

    @PostMapping("/sendmail")
    public String sendMail(@RequestBody EmailDetails emailDetails){
        return email.sendSimpleMail(emailDetails);
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details)
    {
        return email.sendMailWithAttachment(details);
    }
}
