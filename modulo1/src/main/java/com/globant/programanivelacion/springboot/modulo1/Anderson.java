package com.globant.programanivelacion.springboot.modulo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Anderson {

    @Bean
    @Qualifier("get1")
    public Cristian getCristian(){
        return new Cristian();
    }

    @Bean
    @Qualifier("get2")
    public Cristian getCristian2(){
        return new Cristian();
    }


}
