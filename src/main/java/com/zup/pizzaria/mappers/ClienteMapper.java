package com.zup.pizzaria.mappers;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.models.Cliente;

public class ClienteMapper {
    public static Cliente converterDTOParaModelo(ClienteDTO clienteDTO) {
        if (clienteDTO == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        return new Cliente(null, clienteDTO.getNome(), clienteDTO.getEmail(), clienteDTO.getTelefone());
    }
}
