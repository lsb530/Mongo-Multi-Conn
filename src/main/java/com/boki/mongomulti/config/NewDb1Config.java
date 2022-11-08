package com.boki.mongomulti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
//@EnableMongoRepositories(basePackages = {"com.boki.mongomulti.model1"},
@EnableMongoRepositories(basePackageClasses = com.boki.mongomulti.model1.Model1Repository.class,
    mongoTemplateRef = NewDb1Config.MONGO_TEMPLATE
)
public class NewDb1Config {
    protected static final String MONGO_TEMPLATE = "newdb1MongoTemplate";
}
