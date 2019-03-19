fun main(args: Array<String>){

    val predio = Obra("Predio")

    val cimento = Insumo("Cimento", 50.00)
    val areia = Insumo("Areia", 10.00)
    val cal = Insumo("Cal", 20.00)

    val consumoAreia = InsumoConsumido(areia, 50)
    val consumoCimento = InsumoConsumido(cimento, 20)
    val consumoCal = InsumoConsumido(cal, 10)

    val pedreiro = MaoDeObra("Pedreiro",10.00)
    val engenheiro = MaoDeObra("Engenheiro",30.00)

    val trabalhadorTrabalhou = MaoDeObraTrabalhadas (pedreiro,50 )
    val trabalhadorDoisTrabalhou = MaoDeObraTrabalhadas (engenheiro, 30)

    val escavadeira = Equipamento("Escavadeira", 80.00)
    val betoneira = Equipamento("Betoneira", 5.00)

    val maquinaTrabalhou = EquipTrabalho(escavadeira, 10)
    val maquinaDoisTrabalhou = EquipTrabalho(betoneira, 10)


    predio.insumosConsumido.add(consumoAreia)
    predio.insumosConsumido.add(consumoCal)
    predio.insumosConsumido.add(consumoCimento)
    predio.maodeobraTrabalho.add(trabalhadorTrabalhou)
    predio.maodeobraTrabalho.add(trabalhadorDoisTrabalhou)
    predio.equipamentosTrabalho.add(maquinaTrabalhou)
    predio.equipamentosTrabalho.add(maquinaDoisTrabalhou)

    println("OBRA - " + predio.nome)
    println("Insumos: " + predio.gastosComInsumos())
    println("Mão de Obra: " + predio.totalGastosMaoDeObra())
    println("Equipamentos: " + predio.gastosComEquipamento())
    println("Total de Gastos: " + predio.totalGastosObra())}
