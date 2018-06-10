package info.gu3.phew.config;

/**
 * どこかのタイミングで認証機能を入れたい。
 */
//@Configuration
//@EnableWebSecurity
public class WebSecurityConfigure {
//  public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {

//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.formLogin().loginProcessingUrl("/login")
//      .usernameParameter("username")
//      .passwordParameter("password");
//
//    http.authorizeRequests()
//      .antMatchers("/login").permitAll()
//      .anyRequest().authenticated();
//
//    http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//  }
//
//  @Override
//  public void configure(WebSecurity web) throws Exception {
//    web.ignoring().antMatchers("/h2-console/**", "/static/**", "/*.ico");
//  }
//
//  @Bean
//  public PasswordEncoder passwordEncoder() {
//    return NoOpPasswordEncoder.getInstance();
//  }
}
