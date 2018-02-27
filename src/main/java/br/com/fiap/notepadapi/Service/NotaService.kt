package br.com.fiap.notepadapi.Service

import br.com.fiap.notepadapi.Model.nota
import br.com.fiap.notepadapi.Repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService{
    @Autowired
    lateinit var notaRepository:NotaRepository

    fun salvar(nota:nota){
        val aux = notaRepository.findByTitulo(nota.titulo)
        if(aux!=null){
            nota.id = aux.id
        }
        notaRepository.save(nota)
    }

    fun buscarTodas():List<nota> {
        return notaRepository.findAll()
    }

}