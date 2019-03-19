class Obra(var nome: String) {

    val insumosConsumido = arrayListOf<InsumoConsumido>()

    fun gastosComInsumos(): Double {
        var total: Double = 0.0
        for (insumo in insumosConsumido) {
            total += insumo.insumo.preco * insumo.quantidade
        }
        return total
    }

    val maodeobraTrabalho = arrayListOf<MaoDeObraTrabalhadas>()
    fun totalGastosMaoDeObra() :Double {
        var total: Double = 0.0
        for (trabalhador in maodeobraTrabalho) {
            total += trabalhador.maoDeObra.precoPorHora * trabalhador.horasTrabalhadas
        }
        return total
    }

    val equipamentosTrabalho = arrayListOf<EquipTrabalho>()
    fun gastosComEquipamento() :Double {
        var total: Double = 0.0
        for (equipamento in equipamentosTrabalho) {
            total += equipamento.equipamento.custo * equipamento.horas
        }
        return total
    }

    fun totalGastosObra() :Double{
        return gastosComEquipamento() + gastosComInsumos() + totalGastosMaoDeObra()
    }

}