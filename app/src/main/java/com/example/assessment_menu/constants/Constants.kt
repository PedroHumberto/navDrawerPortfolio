package com.example.assessment_menu.constants

object Constants {

    //constante criada para acesso a classe pedro em no projeto; Pensar em forma melhor de armazenar os dados.

    private val info = "Cursando Análise e Desenvolvimento de Sistemas. com foco em cloud computing, " +
            ".NET, Java, Vue, JavaScript, HTML, CSS, React, Python, Android, metodologia SCRUM." +
            "Conhecimentos nas linguagens: JavaScript, C#, Python, Kotlin, CSS\n\n" +
            "Frameworks: Vue.js, Vuex, React\n\n" + "Possuo amplo conhecimento em orientação a objeto.\n\n" +
            "Meu objetivo é me tornar  um desenvolvedor FullStack, com conhecimentos aprofundados em Design Pattern"

    private val formacao = "Instituo INFNET – Faculdade de Tecnologia\n" +
            "Graduação em Análise e Desenvolvimento de Sistemas\n" +
            "2021 – Em Andamento\n"

    private val experiencia = "Projetos Pessoais – Front-End.\n\n\n" +
            "○ Criação de Páginas Responsivas Utilizando HTML, CSS e Javascript\n\n" +
            "○ Criação de SPA com Vue.JS e React.JS\n\n" +
            "○ Controle de autenticação de usuário utilizando RESt API e Firebase\n\n" +
            "○ Controle de estado com Vuex\n\n"

    private val cursos = "Estrutura de dados e algoritmos;\n\n" +
            "C# Primeiros Passos e Lógica de Programação e Algoritmos;\n\n" +
            "Introdução a Git e GitHub.\n\n" +
            "JavaScript Para Back-End\n\n" +
            "Vue.js Testes Unitários Automatizados com JEST\n\n"



    val pedro = Pessoa("Pedro Humberto Gonçalves Cardoso","pedrohumbertogc@gmail.com",
    info,formacao, experiencia, cursos, "Conheça meu github:\n https://github.com/PedroHumberto?tab=repositories")

}