package com.webteam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webteam.model.AccessLevel;
import com.webteam.model.Card;
import com.webteam.model.Posts;
import com.webteam.model.UserDetail;
import com.webteam.repository.CradRepo;
import com.webteam.repository.IAccessLevelRepository;
import com.webteam.repository.Prepo;
import com.webteam.repository.UserDetailRepo;
import com.webteam.service.UserLoginService;
import com.webteam.vo.ServiceResponse;


@RestController

public class MainController{

	@Autowired
	IAccessLevelRepository iAccessLevelRepository;
	@Autowired
	CradRepo cradRepo;
	
	@Autowired
	Prepo prepo;
	
   @Autowired
   UserDetailRepo userDetailRepo;

    @Autowired
    UserLoginService userLoginService;

    @RequestMapping(value="/posts",method = RequestMethod.GET)
    public List<AccessLevel> getByTitle(){
        
    List<Card>	ll = cradRepo.findAll();
    	
for(Card c :ll)
{
	System.out.println(c.getCardNumber());
}
        return iAccessLevelRepository.findAll();
      
    }


   /* @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ServiceResponse saveCC(@RequestBody User user) {
        ServiceResponse serviceResponse = null;
        try{
        userservice.adduser(user);
        serviceResponse = ServiceResponseUtils.dataResponse("1", "data saved successfully", user);
        }catch(Exception e){
          System.out.println("not saved"+e.getMessage());
        }
    return serviceResponse;
    }*/
 
    
    @RequestMapping(value = "/user/checkDuplicate", method = {RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody String findByUserName(@RequestParam("userName") String userName){
		
    	UserDetail obj = userDetailRepo.findByLoginName("issuer");
    	System.out.println("--------print--------"+obj.getLastname());
    	
			return obj.toString();
		
	}
    

    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody ServiceResponse saveCC() {
        ServiceResponse serviceResponse = null;
        try{
       List<UserDetail> llist =userDetailRepo.findAll();
       
       for(UserDetail u :llist) {
    	   System.out.println("printtttt-----list"+u.getFirstname());
       }
      System.out.println("printing list size"+llist.size());
        serviceResponse = ServiceResponseUtils.dataResponse("1", "data saved successfully", llist);
        }catch(Exception e){
          System.out.println("not saved"+e.getMessage());
        }
    return serviceResponse;
    }
    
}