# AutenticacaoSpringBoot
SpringBootAuthenticationInMemory

#Requirements
- GIT
- Java
- Docker
- Docker Compose

#Steps
- Create .jar with gradle in /build/lib
`gradle build` 
- Create docker image named autenticacaospringjdk8
` docker build -t autenticacaospringjdk8 .`
- Up Container in background with docker compose
`docker-compose up -d`
 