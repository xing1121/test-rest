package com.sf.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.rest.domain.Person;
import com.sf.rest.mapper.PersonMapper;

@Service
public class PersonService {

	@Autowired
	private PersonMapper personMapper;
	
	public List<Person> selectAll(){
		return personMapper.selectByExample(null);
	}
	
	public Person selectById(Long id){
		return personMapper.selectByPrimaryKey(id);
	}
	
	public void updateById(Person p){
		personMapper.updateByPrimaryKeySelective(p);
	}
	
	public void deleteById(Long id){
		personMapper.deleteByPrimaryKey(id);
	}
	
	public void insert(Person p){
		personMapper.insertSelective(p);
	}
	
}
