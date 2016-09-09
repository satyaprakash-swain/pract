package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.IPersonDao;
import com.test.dto.Person;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao personDao;

	public String checkName(Person person) {
		if (person.getUserName().equals(null) || person.getEmail().equals(null) || person.getPassword().equals(null)
				|| person.getAges()==0) {
			return null;
		} else {
			return personDao.savePerson(person);
		}

	}
}
