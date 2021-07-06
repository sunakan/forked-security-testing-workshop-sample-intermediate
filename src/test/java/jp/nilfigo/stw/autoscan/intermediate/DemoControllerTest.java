package jp.nilfigo.stw.autoscan.intermediate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class DemoControllerTest {

  // Spring MVCのモック
  private MockMvc mockMvc;

  @BeforeEach
  void setup() {
    // Spring MVCのモックを設定する
    this.mockMvc =
      MockMvcBuilders.standaloneSetup(new DemoController()).build();
  }

  @Test
  void GETでアクセスする() throws Exception {
    mockMvc
      .perform(MockMvcRequestBuilders.get("/greeting"))
      .andExpect(status().isOk());
  }
}
