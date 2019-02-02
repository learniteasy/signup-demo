package com.learneasy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@Configuration
@EnableAutoConfiguration
public class PropertyConfiguration {

	@Value("${welcome.message}")
	private String testProperty;

	@Value("${welcome.date}")
	private String localTestProperty;

	public String getTestProperty() {
		return testProperty;
	}

	public void setTestProperty(String testProperty) {
		this.testProperty = testProperty;
	}

	public String getLocalTestProperty() {
		return localTestProperty;
	}

	public void setLocalTestProperty(String localTestProperty) {
		this.localTestProperty = localTestProperty;
	}
}
