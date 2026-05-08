package br.com.kaike.spring_boot.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProdutoDto {

    private String name;
    private BigDecimal preco;
    private Integer quantidade;
}
