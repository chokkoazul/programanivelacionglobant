package com.globant.programanivelacion.springboot.modulo1.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    @Value("${mensaje}")
    private String mensaje;

    public String saludo() {
        return "Hola desde un component, "+mensaje;
    }
}
