package pe.edu.upeu.syscenterlife;

import java.awt.EventQueue;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import pe.edu.upeu.syscenterlife.igu.Principal;

@SpringBootApplication
public class VeterinarioHApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(VeterinarioHApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
        
            EventQueue.invokeLater(() -> {
            Principal ex = ctx.getBean(Principal.class);
            ex.setContexto(ctx);
            ex.setVisible(true);
        });

            
            
	}

}
