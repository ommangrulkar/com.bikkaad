package com.bikkadIt.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.model.UserEntity;
import com.bikkadIt.repository.UserRepository;
@Service
public class UserserviseImpl implements UserserviseI {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserEntity saveuserEntity(UserEntity userEntity) {
		UserEntity userEntity2 = userRepository.save(userEntity);
		return userEntity2;
	}


	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> all = userRepository.findAll();
		return all;
	}


	@Override
	public UserEntity getSingleUser(int id) {
		UserEntity userEntity = userRepository.findById(id).get();
		return userEntity;
	}


	@Override
	public UserEntity updateUser(UserEntity userEntity) {
		UserEntity save = userRepository.save(userEntity);
		return save;
	}


	@Override
	public List<UserEntity> deleteSingleUser(int id) {
		userRepository.deleteById(id);
		List<UserEntity> findAll = userRepository.findAll();
		return findAll;
	}


	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<UserEntity> saveAll(List<UserEntity> userEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
