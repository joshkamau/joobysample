package com.mycompany;

import org.jooby.Jooby;

import com.mycompany.forms.BigDecimalForm;
import com.mycompany.forms.DateForm;
import com.mycompany.forms.StringForm;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "Hello World!");
    
    get("/process-string", req -> {
    	StringForm form = req.params().to(StringForm.class);
    	return "reached here";
    });
    
    get("/process-date", req -> {
    	DateForm form = req.params().to(DateForm.class);
    	return "reached here";
    });
    
    get("/process-bd", req -> {
    	BigDecimalForm form = req.params().to(BigDecimalForm.class);
    	return "reached here";
    });
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
