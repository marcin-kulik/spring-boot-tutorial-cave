package com.marcinkulik.springboot.jsp.model;

import org.springframework.data.repository.CrudRepository;

/**
 * In computer software, a data access object (DAO) is an object that provides an abstract
 * interface to some type of database or other persistence mechanism.
 * By mapping application calls to the persistence layer, 
 * the DAO provides some specific data operations without exposing details of the database.
 * @author marcinkulik
 *
 */

// crud for Create, read, update and delete
public interface StatusUpdateDao extends CrudRepository<StatusUpdate, Long > {

}
