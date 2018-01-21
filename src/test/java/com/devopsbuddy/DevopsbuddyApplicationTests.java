package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18nService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18nService i18nService;

	@Test
	public void shouldMatchMessage() {
		String expected = "Template Inicial";
		String messageId = "index.main.callout";
		String actual = i18nService.getMessage(messageId);
		assertEquals("The messages don't match", expected, actual);
	}
}
