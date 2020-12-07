package com.fintech.ies.service;

import java.util.List;

import com.fintech.ies.domain.UserDomain;
import com.fintech.ies.entity.UserEntity;

public interface AdminService {

	boolean add(UserDomain userDomain);

	boolean isUniqueEmail(String email);

	public String getRegSuccMailBody(UserDomain userDomain);

	public boolean sendRegSuccMail(String to, String subject, String body);

	public List<UserEntity> viewAccountDetails();

	UserDomain editUserInfo(Integer userId);

   
	
	

}
