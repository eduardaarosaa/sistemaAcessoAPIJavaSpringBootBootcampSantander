package com.demo.swagger;
import springfox.documentation.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Colletions;

public class swagger {

    @Bean

    public Docket apiAdmin(){
        return new Docket(DocumentationType.SWAGGE_2)
                .select()
                .apis(RequestHandleSelectors.basePackage("com.demo.backend"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                        .name("Autorization")
                                        .description("Header para token JWT")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                        )
                )
    }
    @Bean
    public apiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("API-REST")
                .description("code")
                .version("1.0.0")
                .license("Apache license Version 2.0")
                .licenseUrl("https://www.apache.org/license/LICENSE-2.0")
                .contact(new Contact("DIO", "https://web.digitalinnovation.one", "contato@digitalinnovationne.com.br"))
                .build();

    }
}