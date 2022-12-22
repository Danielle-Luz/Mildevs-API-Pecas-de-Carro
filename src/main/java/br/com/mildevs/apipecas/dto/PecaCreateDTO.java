package br.com.mildevs.apipecas.dto;

import br.com.mildevs.apipecas.common.Categoria;
import br.com.mildevs.apipecas.interfaces.PecaDTOGetters;

public class PecaCreateDTO implements PecaDTOGetters {

  private String nome;
  private String modeloCarro;
  private String fabricante;
  private float precoCusto;
  private float precoVenda;
  private int quantidadeEstoque;
  private Categoria categoria;

  public PecaCreateDTO(
    String nome,
    String modeloCarro,
    String fabricante,
    float precoCusto,
    float precoVenda,
    int quantidadeEstoque,
    Categoria categoria
  ) {
    this.nome = nome;
    this.modeloCarro = modeloCarro;
    this.fabricante = fabricante;
    this.precoCusto = precoCusto;
    this.precoVenda = precoVenda;
    this.quantidadeEstoque = quantidadeEstoque;
    this.categoria = categoria;
  }

  public String getNome() {
    return nome;
  }

  public String getModeloCarro() {
    return modeloCarro;
  }

  public String getFabricante() {
    return fabricante;
  }

  public float getPrecoCusto() {
    return precoCusto;
  }

  public float getPrecoVenda() {
    return precoVenda;
  }

  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
