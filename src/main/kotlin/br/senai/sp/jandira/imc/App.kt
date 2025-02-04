package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime

fun main() {

    // Criar o paciente Ana Maria
    var paciente1 = Paciente()
    paciente1.id = 1
    paciente1.nome = "Ana Maria"
    paciente1.email = "ana@gmail.com"
    paciente1.altura =  1.67
    paciente1.peso = 40
    paciente1.dataNascimento = LocalDate.of(2001, 8, 13)
    paciente1.calcularImc()
    paciente1.classificarImc()
    paciente1.mostrarDadosBiometricos()

    // Criar o paciente Pedro de Oliveira
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = "Gabriel Souza Costa"
    paciente2.email = "souzacostagabriel37@gmail.com"
    paciente2.altura = 1.68
    paciente2.peso = 66
    paciente2.dataNascimento = LocalDate.of(2007, 11, 5)
    paciente2.calcularImc()
    paciente2.classificarImc()
    paciente2.mostrarDadosBiometricos()

    // Criar um objeto médico
    var medico1 = Medico()
    var medico2 = Medico()

    medico1.id = 1
    medico1.nome = "Roberta da Silva"
    medico1.email = "roberta@hospital.com"
    medico1.especialidades.add("Nutricionista")
    medico1.especialidades.add("Gastroenterologista")
    medico1.exibirFichaMedico()

    // Criar uma consulta
    var consulta1 = Consulta()
    consulta1.agendarConsulta(
        paciente1,
        medico1,
        LocalDate.of(2025, 10, 8),
        LocalTime.of(10,30),
        199.99
        )
    consulta1.mostrarDadosDaConsulta()
}
