package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.mappers.ClienteMapper;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvarCliente(ClienteDTO clienteDTO) {
            clienteDTO.validar();
            Cliente cliente = ClienteMapper.converterDTOParaModelo(clienteDTO);
            return clienteRepository.save(cliente);
    }
}
