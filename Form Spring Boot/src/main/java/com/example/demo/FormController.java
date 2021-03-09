package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    CustomerRepo repo;
    @RequestMapping("/")
    public  String login(){

        return "Customers";
    }
    @RequestMapping("/details")
    public String save(Customers customers){
        repo.save(customers);
        return "Customers";
    }
    @RequestMapping("/getdetails")
    public String getdetails(){

        return "ViewCustomersDetails";
    }

    @PostMapping("/getdetails")
    public ModelAndView getdetails(@RequestParam("cid")int cid){
        ModelAndView mv=new ModelAndView("Retrive");
        Customers customer=repo.findById(cid).orElse(null);
        mv.addObject(customer);
        return mv;


    }
    @RequestMapping("/customers")
    @ResponseBody
    public List<Customers> getcustomers(){
        return repo.findAll();
    }
    @RequestMapping("/customers/{cid}")
    @ResponseBody
    public Optional<Customers> getcustomers2(@PathVariable("cid") int cid){

        return repo.findById(cid);
    }
    @PostMapping("/customers")
    public Customers getCustomers3(@RequestBody Customers customers){
        repo.save(customers);
        return customers;
    }
    @DeleteMapping("/customers/{cid}")
    public Customers getCustomers4(@PathVariable("cid") int cid){
        Customers customer=repo.getOne(cid);
        repo.delete(customer);
        return customer;
    }
    @PutMapping(path="/customers",consumes ={"application/json"})
    public Customers getCustomers5(@RequestBody Customers customers){
        repo.save(customers);
        return customers;
    }
}
