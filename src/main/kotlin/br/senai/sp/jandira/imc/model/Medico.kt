package br.senai.sp.jandira.imc.model

class Medico {

    var id: Int = 0
    var nome: String = ""
    var especialidades: ArrayList<String> = ArrayList<String>()
    var email: String = ""

    fun exibirFichaMedico(){
        println("-------------------------")
        println("FICHA DO MÉDICO")
        println("-------------------------")
        println("NOME: $nome")
        println("E-MAIL: $email")
        println("Especialidades do médico:")
        for (especialidades in especialidades){
            println(" -> $especialidades")
        }
        println("=========================")
    }
}