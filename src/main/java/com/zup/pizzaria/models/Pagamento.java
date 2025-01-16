package com.zup.pizzaria.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;
    private Double valorPago;
    private LocalDateTime dataHoraPagamento;

    public Pagamento(Long id, Long pedidoId, FormaPagamento formaPagamento, LocalDateTime dataHoraPagamento) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.formaPagamento = formaPagamento;
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDateTime getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public Boolean validarPagamento(Double valorTotalPedido) {
        if (valorPago == null || valorTotalPedido == null) {
            throw new IllegalArgumentException("Os valores não podem ser nulos");
        }
        if (valorPago < valorTotalPedido) {
            throw new IllegalArgumentException("O valor pago não pode ser menos que o valor cobrado do pedido");
        }
        return true;
    }
}
