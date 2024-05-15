package com.devstack.lms.programserviceapi.repo;

import com.devstack.lms.programserviceapi.entity.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepo extends MongoRepository<Program,String> {
}
