package com.boki.mongomulti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
//@EnableMongoRepositories(basePackages = {"com.boki.mongomulti.model2"},
@EnableMongoRepositories(basePackageClasses = com.boki.mongomulti.model2.Model2Repository.class,
    mongoTemplateRef = NewDb2Config.MONGO_TEMPLATE
)
public class NewDb2Config {
    protected static final String MONGO_TEMPLATE = "newdb2MongoTemplate";
}
