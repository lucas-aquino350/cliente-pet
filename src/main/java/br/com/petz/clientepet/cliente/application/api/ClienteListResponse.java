package br.com.petz.clientepet.cliente.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	
}
