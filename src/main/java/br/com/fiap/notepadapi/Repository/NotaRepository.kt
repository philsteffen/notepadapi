package br.com.fiap.notepadapi.Repository



import br.com.fiap.notepadapi.Model.nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository:MongoRepository<nota,String>{
    @Query("{}")
    fun all(): Stream<nota>

    fun findByTitulo(titulo:String):nota
}