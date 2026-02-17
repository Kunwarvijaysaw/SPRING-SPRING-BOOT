package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements Engine {
	@Override
    public String getEngineType() {
        return "Electric";
    }
}