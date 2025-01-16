# Classe Pagamento - Sistema de Pizzaria

Este documento descreve a classe `Pagamento` utilizada no sistema de pizzaria.

## Diagrama UML

```plaintext
+---------------------+
|      Pagamento      |
+---------------------+
| - id: Long          |
| - pedidoId: Long    |
| - formaPagamento:   |
|   FormaPagamento    |
| - valorPago: Double |
| - dataHoraPagamento:|
|   LocalDateTime     |
+---------------------+
| + validarPagamento( |
|   valorTotalPedido: |
|   Double): boolean  |
| + realizarPagamento()|
|   : void            |
+---------------------+