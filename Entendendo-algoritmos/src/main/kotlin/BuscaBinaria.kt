fun buscaBinaria(lista: ArrayList<Int>, item: Int): Int {
    var baixo = 0
    var alto = lista.size - 1

    while (baixo <= alto) {
        var meio = (baixo + alto) / 2
        var chute = lista[meio]
        if (chute == item) {
            return meio
        } else if (chute > item) {
            alto = meio - 1
        } else {
            baixo = meio + 1
        }
    }
    return -1
}