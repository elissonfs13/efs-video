package com.efs.onlinevideo.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OnlineVideo {
	
	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	private String tempo;
	
	private String urlSite;

	private Category categoria;
	
	private String nomeCanalSite;
	
	private String urlCanalSite;
	
	private LocalDate dataCriacao;
	
	private LocalDate dataVisualizacao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getUrlSite() {
		return urlSite;
	}

	public void setUrlSite(String urlSite) {
		this.urlSite = urlSite;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	public String getNomeCanalSite() {
		return nomeCanalSite;
	}

	public void setNomeCanalSite(String nomeCanalSite) {
		this.nomeCanalSite = nomeCanalSite;
	}

	public String getUrlCanalSite() {
		return urlCanalSite;
	}

	public void setUrlCanalSite(String urlCanalSite) {
		this.urlCanalSite = urlCanalSite;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataVisualizacao() {
		return dataVisualizacao;
	}

	public void setDataVisualizacao(LocalDate dataVisualizacao) {
		this.dataVisualizacao = dataVisualizacao;
	}

	@Override
	public String toString() {
		return "OnlineVideo [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", tempo=" + tempo
				+ ", urlSite=" + urlSite + ", categoria=" + categoria + ", nomeCanalSite=" + nomeCanalSite
				+ ", urlCanalSite=" + urlCanalSite + ", dataCriacao=" + dataCriacao + ", dataVisualizacao="
				+ dataVisualizacao + "]";
	}

}
