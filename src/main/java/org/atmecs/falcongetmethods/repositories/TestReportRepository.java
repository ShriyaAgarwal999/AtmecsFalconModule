package org.atmecs.falcongetmethods.repositories;

import org.atmecs.falcongetmethods.models.TestReportModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestReportRepository extends MongoRepository<TestReportModel, String> {

	TestReportModel findByRunsessionid(int id);

}
