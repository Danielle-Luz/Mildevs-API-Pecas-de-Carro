package br.com.mildevs.apipecas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mildevs.apipecas.dto.PecaCreateDTO;
import br.com.mildevs.apipecas.dto.PecaGetResponseDTO;
import br.com.mildevs.apipecas.service.PecaService;

@RestController
@RequestMapping("/pecas")
public class PecaController {
  @Autowired
  PecaService service;

  @GetMapping(path = "{texto}/comeco")
  public List<PecaGetResponseDTO> buscarPecaPeloNome(@PathVariable String texto) {
    return service.buscaPecaPorNome(texto);
  }

  @GetMapping(path = "{modelo}/modelo")
  public List<PecaGetResponseDTO> buscarPecaPeloModeloCarro(@PathVariable String modelo) {
    return service.buscarPecaPeloModeloCarro(modelo);
  }

  @GetMapping(path = "{categoria}/categoria")
  public List<PecaGetResponseDTO> buscarPelaCategoria(@PathVariable String categoria) {
    return service.buscarPecaPelaCategoria(categoria);
  }

  @PostMapping
  public PecaCreateDTO criarPeca(@RequestBody PecaCreateDTO novaPeca) {
    return service.criaPeca(novaPeca);
  }

  
}