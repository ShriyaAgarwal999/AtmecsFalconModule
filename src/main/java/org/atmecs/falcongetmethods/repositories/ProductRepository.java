package org.atmecs.falcongetmethods.repositories;

import java.util.List;

import org.atmecs.falcongetmethods.models.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {

	List<ProductModel> findAll();

	ProductModel findByName(String string);

}
