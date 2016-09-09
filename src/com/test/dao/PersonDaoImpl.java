package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.test.dto.Person;
@Repository
public class PersonDaoImpl implements IPersonDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public String savePerson(Person person) {
		hibernateTemplate.save(person);
		return "success";
	}

}
