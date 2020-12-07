	package com.fintech.ies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fintech.ies.appconstants.AppConstants;
import com.fintech.ies.appprops.AppProps;
import com.fintech.ies.domain.UserDomain;
import com.fintech.ies.entity.UserEntity;
import com.fintech.ies.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AppProps props;
	
	
	@Autowired
	private AdminService adminService;
	
	
	@ModelAttribute
	public String loadFormData(Model model) {
		UserDomain userAcc = new UserDomain();
		model.addAttribute("userAcc", userAcc);
		return AppConstants.REGISTRATION_VIEW   ;

	}
	
	@GetMapping("/register")
	public String loadForm(Model model)
	{
		
		return  AppConstants.REGISTRATION_VIEW;
		
	}
	
	

	@GetMapping("/uniqueEmail")
	@ResponseBody
	public String isUniqueEmail(@RequestParam("email") String email) {

		boolean uniqueMail = adminService.isUniqueEmail(email);

		if (uniqueMail) {
			return "true";
		} else {
			return "false";
		}

	}

	@PostMapping("/UserReistration")
	public String handleRegButton(UserDomain userDomain, RedirectAttributes attributes)
	{
	          boolean  user=adminService.add(userDomain);
	          
	          if(user)
	          {
	        	  
	        	 String regSuccMsg= props.getMessages().get(AppConstants.REG_SUCCESS);
	        	  attributes.addFlashAttribute(AppConstants.SUCESMSG, regSuccMsg);
	          }
	          else
	          {
	          String regFailed= props.getMessages().get(AppConstants.REG_FAIL);
				
				attributes.addFlashAttribute(AppConstants.FAILMSG, regFailed);
	          }
	return "redirect:/userAccountCreationSucces";
	}
	
	
@GetMapping("/userAccountCreationSucces")
public String loadRegistrationSucess(Model model)
{
	UserDomain userAccObj = new UserDomain();

	model.addAttribute("userAcc", userAccObj);
	
	return AppConstants.REGISTRATION_VIEW;
	
}

	
@GetMapping("/ViewAccount")
public String getAccountDetails(Model model)
{
	List<UserEntity> user =adminService.viewAccountDetails();
	model.addAttribute("User", user);
	return AppConstants.VIEW_ACCOUNT;	
}


@GetMapping("/EditUser")
public String editUser(@RequestParam("id") Integer id,Model model)
{
	 UserDomain userAcc =adminService.editUserInfo(id);
	model.addAttribute("userAcc", userAcc);
	return AppConstants.REGISTRATION_VIEW;	
}

	



}
