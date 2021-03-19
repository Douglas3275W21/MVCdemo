package com.testmvc.demomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

        TestModel testModel = new TestModel("MVC Demo Text 1", "MVC Demo Text 2" );

        @GetMapping("/mvcdemo1")
//        public String controller(@ModelAttribute("testJoke") TestModel testModel, Model model){
            public String controller(Model model){

//            TestModel testModel = new TestModel("my first test joke");
            model.addAttribute("demoattrib1", testModel.getTestText());
            model.addAttribute("demoattrib2", testModel.getTestText2());

            return "test";
        }
}
