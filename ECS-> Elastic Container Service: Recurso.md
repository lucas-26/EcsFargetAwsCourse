ECS-> Elastic Container Service: Recurso para executar aplicações dentro de 
    Containers (exemplo... uma aplicação spring boot rodando em um container docker)

es2 -> Elastic compute Clound: permite que maquinas virtuais sejam alugadas para que os o usuários rodem suas proprias aplicações.    

Fargate -> vai atuar junto com o ecs prover os recursos, basicamente se tratando de cpu e memória.

application load balancer -> Distribuir melhor as requisições entre as varias instancias dos seu serviço.

target group -> quando configurado a parte de saude das apis, no caso do spring boot o actuator, ele fica escutando endpoint /health e caso ele tenha duas respostas diferenter de 200 ele vai fazer o processo de matar essa instancia e subir outra.

vpc -> maneira de  proteger os recursos do acesso externo, deixar ele dentro de uma rede onde se pode controlar a entrada e a saida de dados.

Relational database Service -> Criar uma instancia de um banco relacional e a aws toma conta disso para nós

DynamoDB -> Banco de dados não relacional da aws

SNS -> Simple notification Service: Enviar notificacoes para outros servicos 

SQS ->  Simple Queue Service: mecanismo de filas onde pode coonsumir essas mensagens quando necessário

sts -> Simple Storage Service: armazenar arquivos e processar de uma forma mais controlada

CloundWatch -> ferramenta de monitoramento onde de pode ver logs metricas e outras informações dos serviços.

CloundFormation -> é um processo automatico para criação de recursos, esse controle ocorre atraves de templates, arquivos yml ou json para definir a arquitetura assim é possivel replicar o ambiente mais fácil e versionar também.
Os templates são enviados ao cloundFormation e assim são criadas as stacks. as stacks são criadas para gerenciar  a criação dos recursos, logo em seguida os recursos são criados.

cli -> recurso de console criado pela aws 

cdk -> recurso criado pela a aws para criação e deploy de aplicação 