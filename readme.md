JAVA CONFIG BEAN

Step 1: create a java class and annotate as @Configuration

Step 2: Define @Bean method to configure the bean


@Configuration
public class SportConfig{
    @Bean
    public coach swimCoach(){
        return new SwimCoach();
    }
}

Step 3: Inject the bean to the controller