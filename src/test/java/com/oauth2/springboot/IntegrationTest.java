package com.oauth2.springboot;

import com.oauth2.springboot.config.AsyncSyncConfiguration;
import com.oauth2.springboot.config.EmbeddedSQL;
import com.oauth2.springboot.config.JacksonConfiguration;
import com.oauth2.springboot.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { SpringbootJhipster2App.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
