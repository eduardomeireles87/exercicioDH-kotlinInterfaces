package `interface`

fun main() {

    var documento = documento("CPF", "Identidade")
    var foto = foto("Foto", "Imagem")
    var contrato = contrato("Contrato", "Contrato de Trabalho")
    var impressora = impressora()

    impressora.addImprimivel(foto)
    impressora.addImprimivel(contrato)
    impressora.addImprimivel(documento)
    impressora.imprimirLista()

}