package com.test1;

public interface Authenticator {
	
	//����ó���� UserException���� �ñ��.
	public void authen(String userId,String userPwd) 
		throws UserException;
			
}