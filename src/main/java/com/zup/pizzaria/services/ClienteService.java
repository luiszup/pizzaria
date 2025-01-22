package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.mappers.ClienteMapper;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvarCliente(ClienteDTO clienteDTO) {
            Cliente cliente = ClienteMapper.converterDTOParaModelo(clienteDTO);
            return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getById(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }
}
