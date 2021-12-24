package com.example.configclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author madplay
 */
@Service
@RefreshScope
public class DynamicConfigService {

	@Value("${cache.profile}")
	private String profile;

	public String getConfig() {
		return ("cacheON".equals(profile))?"cacheON":"cacheOFF";
	}
}