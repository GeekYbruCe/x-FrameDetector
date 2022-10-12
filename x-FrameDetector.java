X-Frame-Options: DENY


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http
      // ...
          .headers()
              .frameOptions()
                  .sameOrigin();
    }

PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
System.setOut(out);


PrintStream out = new PrintStream(
        new FileOutputStream("output.txt", append), autoFlush);
System.setOut(out);


$ java MyApp > output.txt   

}


