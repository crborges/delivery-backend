package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.devsuperior.dsdeliver.entities.Product;
import com.sun.istack.NotNull;

public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private 				Long 	id;
	@NotBlank
	private 				String 	nome;
	@NotNull
	private 				Double 	preco;
	private 				String 	descricao;
	private 				String 	imgUrl;
	
	

	
	public ProductDTO(Long id, String nome, Double preco, String descricao, String imgUrl) {
		super();
		this.id 		= id;
		this.nome 		= nome;
		this.preco 		= preco;
		this.descricao 	= descricao;
		this.imgUrl 	= imgUrl;
	}
	
	
	public ProductDTO(Product entity) {
		id 			= entity.getId();
		nome 		= entity.getName();
		preco 		= entity.getPrice();
		descricao 	= entity.getDescription();
		imgUrl 		= entity.getImageUri();
	}




	public ProductDTO() {		super();	}

	public void setId(Long id) 					{	this.id = id;					}
	public void setNome(String nome) 			{	this.nome = nome;				}
	public void setPreco(Double preco) 			{	this.preco = preco;				}
	public void setDescricao(String descricao) 	{	this.descricao = descricao;		}
	public void setImgUrl(String imgUrl) 		{	this.imgUrl = imgUrl;			}

	public Long getId() 						{	return id;						}
	public String getNome() 					{	return nome;					}
	public Double getPreco() 					{	return preco;					}
	public String getDescricao() 				{	return descricao;				}
	public String getImgUrl() 					{	return imgUrl;					}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
