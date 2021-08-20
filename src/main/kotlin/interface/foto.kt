package `interface`

class foto(override var nome: String, override var tipoDeDocumento: String) : IImprimivel{
    override fun imprimir() {
        println("Eu sou $tipoDeDocumento, $nome")
    }
}