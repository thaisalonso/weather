# Weather

É uma aplicação para consulta do clima de cidades, que utiliza a [OpenWeatherMap API](http://openweathermap.org/api).

## Requisitos

* Java 8;
* Maven 3;
* API key da [OpenWeatherMap API](http://openweathermap.org/api).

## Como executar

Incluir a API key na propriedade chave.openweather do arquivo application.properties.

Executar o comando abaixo: 

``` bash
mvn spring-boot:run
```
## Como usar

Acessar a url (http://localhost:8080/clima), selecionar uma cidade e clicar em Consultar.