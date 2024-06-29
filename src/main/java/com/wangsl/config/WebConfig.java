package com.wangsl.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * @author Wangsl
 * @date 2024/6/29
 * @Description Web 相关配置
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 * 默认拦截器 其中lang表示切换语言的参数名
	 *
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
		localeInterceptor.setParamName("lang");
		registry.addInterceptor(localeInterceptor);
	}

}
