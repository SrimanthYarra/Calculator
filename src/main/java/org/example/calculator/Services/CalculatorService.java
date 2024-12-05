package org.example.calculator.Services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.example.calculator.ModelDtos.CalculationAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class CalculatorService {

    @Autowired
    private JavaMailSender mailSender;

    public float generateOutput(CalculationAttributes attributes) throws MessagingException {
        float result = output(attributes);
        sendEmail(attributes.getEmailId(),"Welcome to Calculation world",
                generateMailBody(attributes));
        return result;
    }

    public float output(CalculationAttributes attributes){
        return switch (attributes.getOperation()) {
            case "Addition" -> attributes.getFirstParameter() + attributes.getSecondParameter();
            case "Subtraction" -> attributes.getFirstParameter() - attributes.getSecondParameter();
            case "Multiplication" -> attributes.getFirstParameter() * attributes.getSecondParameter();
            case "Division" -> attributes.getFirstParameter() / attributes.getSecondParameter();
            case "Modulus" -> attributes.getFirstParameter() % attributes.getSecondParameter();
            default -> 0;
        };
    }

    public String generateMailBody(CalculationAttributes attributes){
        return"I am very happy!! \nthe "+attributes.getOperation()
                +" of "+attributes.getFirstParameter()+" and "+
                attributes.getSecondParameter()+" is "+
                output(attributes);
    }

    public void sendEmail(String toMail, String subject, String body) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);
        helper.setTo(toMail);
        helper.setSubject(subject);
        helper.setText(body);
//        helper.addAttachment("myImage.jpg",new File(
//                "C:\\Users\\syarra\\Downloads\\shared image.jpg"));
        mailSender.send(message);

    }



}
