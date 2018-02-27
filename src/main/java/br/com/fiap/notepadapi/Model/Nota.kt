package br.com.fiap.notepadapi.Model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class nota(@Id var id:String,
                var titulo:String,
                var conteudo:String
                )