package br.com.fiap.notepadapi.Controler

import br.com.fiap.notepadapi.Model.nota
import br.com.fiap.notepadapi.Service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/nota")
class NotaController {
    @Autowired
    lateinit var notaService: NotaService

    @GetMapping
    internal fun buscarTodos():List<nota>{
        return notaService!!.buscarTodas()
    }

    @PostMapping
    fun salvar (@RequestBody nota:nota){
        notaService.salvar(nota)
    }
}