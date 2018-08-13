package com.sf.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sf.rest.domain.Person;
import com.sf.rest.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/persons", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	@ResponseBody
	public List<Person> findAll(){
		return personService.selectAll();
	}
	
	@RequestMapping(value="/person/{id}", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	@ResponseBody
	public Person findOne(@PathVariable(name="id") Long id){
		return personService.selectById(id);
	}
	
	@RequestMapping(value="/person/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteOne(@PathVariable(name="id") Long id){
		personService.deleteById(id);
	}
	
	@RequestMapping(value="/person", method=RequestMethod.PUT)
	@ResponseBody
	public void updateOne(Person p){
		personService.updateById(p);
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	@ResponseBody
	public void insertOne(Person p){
		personService.insert(p);
	}
	
}
