package br.com.kaike.spring_boot.database.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProdutoEntity {
    private Integer id;
    private String name;
    private BigDecimal preco;
    private Integer quantidade;
}
