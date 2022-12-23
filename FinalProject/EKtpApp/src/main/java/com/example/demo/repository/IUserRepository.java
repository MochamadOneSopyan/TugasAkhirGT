package com.example.demo.repository;

import org.apache.catalina.User;

import com.example.demo.model.AddUser;
public interface IUserRepository {
	
	public AddUser login(String email,String password);
	
	public AddUser insertAddUser(AddUser adduser);
	
//	public List<AddUser> getAllAddUser();
//	public AddUser updateAddUser(int id, AddUser adduser);
//	public AddUser deleteAddUser(int id);
//
//	public AddUser getUser(int id);
//	public AddUser getStudent(int id);

}
