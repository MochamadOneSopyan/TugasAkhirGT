package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AddAnggota;
import com.example.demo.model.AddKk;


public interface IKkService {

	public AddKk insertAddKk(AddKk addkk);
	public List<AddKk> getAllAddKk();
	public AddKk updateAddKk(int id, AddKk addkk);
	public AddKk deleteAddKk(int id);
	public AddKk getKk(int id);
	public AddKk getAllKk (int id);
}
