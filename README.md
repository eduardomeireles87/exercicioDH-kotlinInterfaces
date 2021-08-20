# exercicioDH-kotlinInterfaces



Interfaces Kotlin


Criar uma interface Imprimível que contém dois atributos nome e tipo de documento, ambas são do tipo String. Em seguida crie a assinatura da função imprimir().

Agora crie três classes, elas serão nossos documentos, cada um deles precisará implementar a interface Imprimível, sobrescrevendo suas propriedades e funções. Mas cada documento deve saber se imprimir:


Seguindo o padrão: “Eu sou $tipoDeDocumento, $nome”

** Utilizando Strings templates para preparar a impressão

FOTO -> Na função deve printar: Eu sou uma foto, selfie
DOCUMENTO -> Na função deve printar: Eu sou um documento, RG
CONTRATO -> Na função deve printar: Eu sou um contrato, contrato de trabalho


Em seguida crie uma classe chamada Impressora, nesta classe terá uma propriedade chamada listaimprimivel, essa propriedade é do tipo mutableListOf, que vai carregar uma lista do tipo Imprimivel.

Documento mutableListOf:
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of.html


Crie uma função que pega um Imprimível e adiciona na listaimprimivel, para isso a função recebe como parâmetro uma propriedade do tipo Imprimivel, assim conseguirá adicionar esse imprimível na lista, através do .add().

Crie uma função que imprima tudo que está na listaimprimivel, nessa função pode-se utilizar do for para percorrer a lista e imprimir todos os aquivos. Segue o exemplo:
for 

(tipoDaLista in nomeDaLista){


//execute o bloco


}


Por fim crie um arquivo kotlin que contenha a função Main, dentro dela crie um objeto de cada classe, sendo Documento, Foto, Contrato e Impressora. Agora utilizando a impressora adicione cada documento na impressão e imprima todos.
