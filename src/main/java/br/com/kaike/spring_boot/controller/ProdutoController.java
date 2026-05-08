package br.com.kaike.spring_boot.controller;

import br.com.kaike.spring_boot.database.model.ProdutoEntity;
import br.com.kaike.spring_boot.dto.ProdutoDto;
import br.com.kaike.spring_boot.exception.NotFoundException;
import br.com.kaike.spring_boot.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor

public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {

        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto) {
        return produtoService.createProduct(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity ulpdate(@PathVariable Integer id,
            @RequestBody ProdutoDto produtoDto) throws NotFoundException {
        return produtoService.atualizar(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deltar(@PathVariable Integer id){
        produtoService.removerProduto(id);
    }
}
