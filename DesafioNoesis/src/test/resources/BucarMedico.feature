#language: pt
Funcionalidade: Pesquisar m�dicos no site da Unimed

  @Desafio1
    Cenario: Buscar medicos especialista em cardiologia no estado do Rio de janeiro e cidade do Rio de Janeiro
    Dado preciso entrar no site da Unimede 
    Quando clico no botao consulta agora
    E clico em busca detalhada
    E escrevo a especialidade cardiologia
    E escrevo o estado Rio de Janeiro
    E escrevo a ciade Rio de Janeiro
    E clico em Pesquisar
    Entao eu tenho todos os medicos da especialidade cardiologia do Rio de Janeiro

  @Desafio2
    Cenario: Pesquisar medicos no Rio de Janeiro e nao pode apresentar resultados na cidade de Sao Paulo
    Dado que estou no site da Unimed e consulte o Guia Medico
    Quando eu escrevo a cidade Rio de Janeiro
    E clico em Pesquisar
    Entao nao terei resultados dos medicos que contenha a cidade Sao Paulo