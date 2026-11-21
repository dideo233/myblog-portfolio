package com.dideo.myblog_portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
public class HelloControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void 홈에_접속하면_블로그_화면을_반환한다() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(model().attribute("blogTitle", "My Blog"))
                .andExpect(model().attribute(
                        "welcomeMessage",
                        "나만의 백엔드 블로그에 오신 것을 환영합니다."
                ))
                .andExpect(content().string(containsString("My Blog")));
    }

}
