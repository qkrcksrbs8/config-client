package com.example.configclient.controller;

import com.example.configclient.service.DynamicConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author madplay
 */
@RestController
public class ConfigController {

	private final DynamicConfigService configDynamicService;

	@Autowired // 단일 생성자여서 어노테이션을 제외해도 되긴하다.
	public ConfigController(DynamicConfigService configDynamicService) {
		this.configDynamicService = configDynamicService;
	}

	@GetMapping(value = "/dynamic")
	public Object getConfigFromDynamic() {
		return configDynamicService.getConfig();
	}
}