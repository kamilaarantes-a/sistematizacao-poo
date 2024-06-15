# Sistema de Geração de Cartões de Funcionários da MGS

## Descrição Geral

A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam frequentemente para oferecer os produtos da MGS a diversas empresas. Devido à rotina pesada de viagens, vários funcionários enfrentaram episódios de saúde onde ficaram inconscientes e necessitaram de ajuda de terceiros. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões contendo as principais informações dos funcionários, como alergias, problemas médicos, e contatos de emergência.

Este projeto implementa um sistema simples para gerenciar as informações dos funcionários, permitindo a inserção e recuperação de dados através de um terminal. O objetivo é garantir que, em situações de emergência, as informações críticas estejam disponíveis para ajudar no atendimento dos funcionários.

## Funcionalidades

- Adicionar um funcionário com suas informações pessoais, alergias, problemas médicos, e contatos de emergência.
- Recuperar as informações de um funcionário utilizando seu identificador único (ID).

## Instruções para Colocar o Projeto em Operação

### Pré-requisitos

- Java Development Kit (JDK) instalado. [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Eclipse IDE instalado. [Download Eclipse](https://www.eclipse.org/downloads/)

### Passos para Configuração

1. **Clone o Repositório**

   Clone este repositório em sua máquina local utilizando o comando:
   ```sh git clone https://github.com/seu-usuario/seu-repositorio.git ```

2. **Importe o Projeto no Eclipse**

   - Abra o Eclipse IDE.
   - Selecione `File` > `Open Projects from File System...`.
   - Clique em `Directory...` e navegue até o diretório onde você clonou o repositório.
   - Selecione a pasta do projeto e clique em `Finish`.

3. **Executando o Projeto**

   - No painel do Projeto, expanda a pasta `src` e encontre o arquivo `Main.java` dentro do pacote `sistematizacaopoo`.
   - Clique com o botão direito do mouse no arquivo `Main.java` e selecione `Run As` > `Java Application`.

### Estrutura do Código

O projeto é composto pelas seguintes classes principais:

- `Employee`: Representa um funcionário e armazena suas informações pessoais.
- `EmployeeManager`: Gerencia uma coleção de funcionários, permitindo adicionar e recuperar funcionários pelo ID.
- `Main`: Contém o método `main` e o loop principal do programa, permitindo a interação do usuário via terminal.

### Como Usar o Sistema

1. **Adicionar um Funcionário**
   - Escolha a opção 1 no menu.
   - Insira as informações solicitadas: nome, ID, e-mail, número de telefone, alergias e condições médicas.

2. **Recuperar Informações de um Funcionário**
   - Escolha a opção 2 no menu.
   - Insira o ID do funcionário que deseja consultar.
   - As informações do funcionário serão exibidas no terminal.

3. **Sair do Sistema**
   - Escolha a opção 3 para sair do sistema.

### Exemplo de Uso

```plaintext
1. Add Employee
2. Get Employee
3. Exit
Enter your choice: 1
Enter name: John Smith
Enter ID: 123
Enter email: john.smith@example.com
Enter phone number: 55 61 12345-1234
Enter allergies: None
Enter medical conditions: None

1. Add Employee
2. Get Employee
3. Exit
Enter your choice: 2
Enter employee ID: 123
Name: John Doe
ID: 123
Email: john.smith@example.com
Phone Number: 55 61 12345-1234
Allergies: None
Medical Conditions: None
```

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests. Para mudanças maiores, por favor, abra uma issue primeiro para discutir o que você gostaria de mudar.

---
