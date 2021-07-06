package jp.nilfigo.stw.autoscan.intermediate;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * [はじめてのSpringBoot3　～ログイン機能:デフォルト～](https://zenn.dev/waka_morita/articles/ec561dc24e0ab2)
 * SpringSecurityを利用するための設定クラス
 * ログイン処理でのパラメータ、画面遷移や認証処理でのデータアクセス先を設定する
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  /**
   * 認可設定を無視するリクエストを設定
   * 静的リソース(image,javascript,css)を認可処理の対象から除外する
   */
  @Override
  public void configure(WebSecurity web) throws Exception {
    // web.ignoring().antMatchers("/resources/**");
  }
}
