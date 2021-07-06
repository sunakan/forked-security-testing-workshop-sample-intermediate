package jp.nilfigo.stw.autoscan.intermediate;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public String getIndex(@RequestParam(required = false) String username, Model model){
    Optional<String> opt = Optional.ofNullable(username);
    String message = "こんばんは！ " + opt.orElse("どこかのだれかさん");
    model.addAttribute("greeting", message);
      return "index";
  }

  @RequestMapping(value = "/greeting", method = RequestMethod.POST)
  public String postIndex(@RequestParam String username, Model model){
    String message = "いらっしゃい！ " + username;  
    model.addAttribute("greeting", message);
      return "index";
  }
}
