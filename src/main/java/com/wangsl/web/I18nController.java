package com.wangsl.web;

import com.wangsl.utils.MessageUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/i18n")
public class I18nController {

	@RequestMapping("/user")
	public String getUserName() {
		return MessageUtils.get("username");
	}
}
