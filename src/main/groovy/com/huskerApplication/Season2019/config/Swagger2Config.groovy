package com.huskerApplication.Season2019.config


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage('com.huskerApplication.Season2019.controller'))
                .paths(PathSelectors.regex('/api/.*'))
                .build().apiInfo(apiInfo())
                .ignoredParameterTypes(MetaClass.class)
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title('Husker 2019 Bet API')
                .description('SpringBoot v1.x REST API that supports the springboot sample application')
                .contact(new Contact('John T Cronin', '', 'Johnt.Cronin@mutualofomaha.com'))
                .license('Apache 2.0')
                .licenseUrl('http://www.apache.org/licenses/LICENSE-2.0.html')
                .version('1.0')
                .build()
    }
}