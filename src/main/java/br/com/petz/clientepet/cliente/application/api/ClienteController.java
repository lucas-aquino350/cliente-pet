package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {
	private final ClienteService clienteService;
	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] clienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] clienteController - postCliente");
		return clienteCriado;
	}
	@Override
	public List<ClienteListResponse> getCliente() {
		log.info("[inicia] clienteController - getTodosCliente");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] clienteController - getTodosCliente");
		
		return clientes;
	}
	@Override
	public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
		log.info("[inicia] clienteController - getTodosClienteAtravesId");
		log.info("[idCliente] {}", idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] clienteController - getTodosClienteAtravesId");
		return clienteDetalhado;
	}
}
