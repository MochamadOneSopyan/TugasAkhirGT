package com.example.demo.service;

import java.util.List;

import org.apache.catalina.User;

import com.example.demo.model.AddUser;

public interface IUserService {
	public AddUser insertAddUser(AddUser adduser);
	public AddUser login(String email,String password);
//	public List<AddUser> getAllAddUser();
//	public AddUser updateAddUser(int id, AddUser adduser);
//	public AddUser deleteAddUser(int id);
//	public AddUser getStudent(int id);
}
