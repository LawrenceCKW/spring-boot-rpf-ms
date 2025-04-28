package com.kokwai.experiencesvc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(ContainerConfig.class)
@SpringBootTest
class ExperienceSvcApplicationTests {

    @Test
    void contextLoads() {}
}
