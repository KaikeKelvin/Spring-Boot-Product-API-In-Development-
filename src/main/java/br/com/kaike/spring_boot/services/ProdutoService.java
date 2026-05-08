package br.com.kaike.spring_boot.services;

import br.com.kaike.spring_boot.database.model.ProdutoEntity;
import br.com.kaike.spring_boot.dto.ProdutoDto;
import br.com.kaike.spring_boot.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static final List<ProdutoEntity> PRODUTOS =  new ArrayList<>();
    static {
        PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .name("notebook")
                .preco(new BigDecimal(5000))
                .quantidade(10)
                .build());
        PRODUTOS.add(ProdutoEntity.builder()
                        .id(2)
                        .name("notebook")
                        .preco(new BigDecimal(5000))
                        .quantidade(10)
                        .build());
    };

    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }
    public ProdutoEntity createProduct(ProdutoDto produtoDto){
        Integer integer = PRODUTOS.stream()
                .mapToInt(ProdutoEntity::getId)
                .max()
                .orElse(0) + 1;
        ProdutoEntity novoProduto = ProdutoEntity.builder()
                .id(integer).name(produtoDto.getName()).preco(produtoDto.getPreco()).quantidade(produtoDto.getQuantidade()).build();
        PRODUTOS.add(novoProduto);

        return novoProduto;
    }
    public ProdutoEntity atualizar(ProdutoDto produtoDto, Integer id) throws NotFoundException {
        ProdutoEntity produtos = PRODUTOS.stream()
                .filter(p -> p.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new NotFoundException("produto não encontrado"));
        produtos.setName(produtoDto.getName());
        produtos.setPreco(produtoDto.getPreco());
        produtos.setQuantidade(produtoDto.getQuantidade());

        return produtos;
    }
    public void removerProduto(Integer id){
        PRODUTOS.removeIf(p -> p.getId().equals(id));
    }
}
