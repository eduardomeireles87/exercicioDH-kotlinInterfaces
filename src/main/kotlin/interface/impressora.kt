package `interface`

class impressora {

    val listaImprimivel = mutableListOf<IImprimivel>()

    fun addImprimivel(imprimivel: IImprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimirLista() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}