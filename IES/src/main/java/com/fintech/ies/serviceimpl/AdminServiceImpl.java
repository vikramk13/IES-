package com.fintech.ies.serviceimpl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintech.ies.appconstants.AppConstants;
import com.fintech.ies.domain.UserDomain;
import com.fintech.ies.entity.UserEntity;
import com.fintech.ies.repository.UserRepo;
import com.fintech.ies.service.AdminService;
import com.fintech.ies.utils.EmailUtils;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailUtils utils;

	
	@Override
	public boolean add(UserDomain userDomain) {
		// TODO Auto-generated method stub

		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(userDomain, entity);
		UserEntity user = userRepo.save(entity);
		Integer userId = user.getId();

		if (userId != null) {
			String to = userDomain.getEmail();
			String subject = AppConstants.EMAIL_SUBJECT_MSG;
			String body = getRegSuccMailBody(userDomain);
			sendRegSuccMail(to, subject, body);
			return true;
		}
		else
		{
			return false;
		}

	}

	@Override
	public boolean isUniqueEmail(String email) {
		// TODO Auto-generated method stub
		
	          UserEntity user= userRepo.findByEmail(email);	
	          if(user!=null)
	          {
	        	  return true;
	          }
	          else
	          {
	        		return false;
	          }
		
	
	}

	@Override
	public String getRegSuccMailBody(UserDomain userDomain) {
		// TODO Auto-generated method stub

		List<String> replacedLines = null;
		String mailBody = null;

		try {
			String fileName = AppConstants.SENDING_ACCOUNT_DETAILS_TXT;
			Path path = Paths.get(fileName);
			/* Stream<String> lines = Files.lines(path); */
			@SuppressWarnings("resource")
			Stream<String> lines = Files.lines(path);
			replacedLines = lines.map(line -> line.replace(AppConstants.FIRST_NAME, userDomain.getFirstName())
					.replace(AppConstants.LAST_NAME, userDomain.getLastName())
					.replace(AppConstants.EMAIL, userDomain.getEmail())
					.replace(AppConstants.PASSWORD, userDomain.getPassword())).collect(Collectors.toList());
			mailBody = String.join("", replacedLines);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mailBody;

	}

	@Override
	public boolean sendRegSuccMail(String to, String subject, String body) {
		// TODO Auto-generated method stub

		return utils.sendEmail(to, subject, body);

	}

	
	public List<UserEntity> viewAccountDetails() {
		// TODO Auto-generated method stub
		
	   List<UserEntity> list= userRepo.findAll();
	
	      return  list;
	
	  
	}

	@Override
	public UserDomain editUserInfo(Integer id) {
		// TODO Auto-generated method stub
		
		UserEntity user=  userRepo.findById(id);
		
		UserDomain entity=new UserDomain();
		
		BeanUtils.copyProperties(user,entity );
		
		
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setEmail(user.getEmail());
		entity.setDateOfBirth( user.getDateOfBirth());
		entity.setGender(user.getGender());
		entity.setSsnno(user.getSsnno());
		entity.setPhoneNo(user.getPhoneNo());
		entity.setRole(user.getRole());
		
		
		
		
		return entity;
		
		
	}

	
	 

}
