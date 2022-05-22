package com.bikkadIt.servise;

import java.util.List;

import com.bikkadIt.model.UserEntity;

public interface UserserviseI {
	
	UserEntity saveuserEntity(UserEntity userEntity);

	List<UserEntity> getAllUser();
	
	UserEntity getSingleUser(int id);
	
	UserEntity updateUser(UserEntity userEntity);
	
	List<UserEntity> deleteSingleUser(int id);
	
     void deleteAllUser();
     
     List<UserEntity> saveAll(List<UserEntity> userEntity);


}
