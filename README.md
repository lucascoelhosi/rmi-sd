# rmi-sd
Projeto proposto na terceira tarefa da disciplina de Sistemas Distribuídos do Curso GB em Sistemas de Informação da Universidade Federal do Piauí - Campus Senador Helvídeo Nunes de Barros.

Implementar uma comunicação cliente/servidor em três camadas: 
(1) Camada Cliente, 
(2) Camada de Aplicação, e 
(3) Camada de Banco de Dados. 

A camada 1 fica do lado do cliente, as camadas 2 e 3 ficam no servidor.
- O usuário envia ao servidor um conjunto de números desordenados
- A camada de Aplicação ordena os números, retorna o conjunto ordenado ao Cliente
- A camada de Aplicação salva no banco de dados os valores ordenados da operação

Neste projeto foi utilizado Java para a implementação do das camadas
