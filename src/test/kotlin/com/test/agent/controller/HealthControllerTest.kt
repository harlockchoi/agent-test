package com.test.agent.controller

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class HealthControllerTest {

    @Test
    fun `health endpoint returns OK`() {
        val controller = HealthController()
        val mockMvc = MockMvcBuilders.standaloneSetup(controller).build()

        mockMvc.perform(get("/health"))
            .andExpect(status().isOk)
            .andExpect(content().string("OK"))
    }
}
