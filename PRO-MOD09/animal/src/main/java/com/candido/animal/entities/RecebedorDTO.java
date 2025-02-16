package com.candido.animal.entities;

import java.time.LocalDate;

/**
 * @param nomeRecebedor
 * @param dataInicial
 * @param dataFinal
 * @author Douglas Candido
 * <p>
 * DTO para consulta de animais recebidos por um recebedor em um intervalo de tempo determinado
 */
public record RecebedorDTO(String nomeRecebedor, LocalDate dataInicial, LocalDate dataFinal) {
}
