    @startuml

    class Pessoa{
    - nome: String
    - CPF: String
    - telefone: String
    - endereco: String
    - dataNasc: LocalDate
    - sexo: Enum
    }

    class Cliente{
    - id: int
    + CadastroCliente()
    + AlteracaoCliente()
    + ConsultaCliente()
    + ExclusaoCliente()
    + FazerPedido()
    }

    class Garcom{
    - codigo: int
    - metaDiaria: int
    + AntotaPedido()
    + CadastroGarcom()
    + AlteracaoGarcom()
    + ConsultaGarcom()
    + ExclusaoGarcom()
    }
    class Cozinheiro{
    - codigo: int
    + CozinhaPedidos()
    + CadastroCozinheiro()
    + AlteracaoCozinheiro()
    + ConsultaCozinheiro()
    + ExclusaoCozinheiro()
    }

    class Caixa{
    - codigo: int
    + PagamentoPedido()
    + CadastroCaixa()
    + AlteracaoCaixa()
    + ConsultaCaixa()
    + ExclusaoCaixa()
    }

    class Pedido{

    - numPedido: int
    - quantidade: int
    - valor: double
    - produtos: String
    - mesa: int
    + CadastroPedido()
    + AlteracaoPedido()
    + ExclusaoPedido()
    + ConsultaPedido()
    + FechamentoPedido()
    + AvaliacaoPedido()
    }

    Pessoa <-- Cliente
    Pessoa <-- Garcom
    Pessoa <-- Cozinheiro
    Pessoa <-- Caixa

    Garcom -- Pedido
    Cozinheiro -- Pedido
    Caixa -- Pedido

    @enduml