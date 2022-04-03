package com.lankaris.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
    public SomeCdiDao getSomeCdiDAao() {
        return someCdiDAao;
    }

    public void setSomeCdiDAao(SomeCdiDao someCdiDAao) {
        this.someCdiDAao = someCdiDAao;
    }

    @Autowired
    SomeCdiDao someCdiDAao;
}
