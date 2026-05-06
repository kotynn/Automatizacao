#### Automatizacao

>> Oque pretendemos fazer? <br>
    - Com o intuito de automatizar tarefas, vamos criar programas com java e python para o uso
    no dia a dia.
    Exemplos: criação de tabelas do exel, resumo de videos do youtube, resumo de arquivos PDF ou etc.

>> Linguagens que vamos utilizar: <br>
    - HTML e CSS
    - Python com Flask
    - Java e SpringBoot

>> Estrutura do projeto

automation-platform/
│
├── backend-java/
│   └── spring boot
│
├── python-services/
│   ├── pdf-service/
│   ├── youtube-service/
│   ├── excel-service/
│   └── ai-service/
│
└── docker-compose.yml

>> Resumo de PDFs

Usuário envia PDF
       ↓
Spring Boot salva arquivo
       ↓
Python extrai texto
       ↓
Python gera resumo
       ↓
Spring retorna resultado

>> Resumo de video

Usuário envia URL
       ↓
Python pega legenda
       ↓
IA resume conteúdo
       ↓
Spring salva histórico

>>Ordem ideal para aprender
Etapa 1

Aprender:

REST API
Spring Boot
Controllers
Services
JSON

Etapa 2

Aprender Python:

manipulação de arquivos
pandas
requests
automação
Etapa 3

Integração:

Spring → Python
upload de arquivos
APIs
Etapa 4

IA:

sumarização
embeddings
LLMs
RAG
