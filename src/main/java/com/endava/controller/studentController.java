package com.endava.controller;

import com.endava.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
public class studentController {

    @RequestMapping(value ="/form",method = RequestMethod.GET)
    public ModelAndView insertStudent(){
        ModelAndView formView = new ModelAndView("form");
        return formView;
    }

    @RequestMapping(value ="/submitedForm",method = RequestMethod.POST)
    public ModelAndView showStudent(@Valid @ModelAttribute Student student, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            ModelAndView modelAndViewForm = new ModelAndView("form");
            return modelAndViewForm;
        }
        ModelAndView modelAndView = new ModelAndView("ShowStudentInformation");
        modelAndView.addObject("result",student);
        return modelAndView;
    }
}
