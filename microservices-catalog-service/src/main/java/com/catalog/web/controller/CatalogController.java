package com.catalog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.web.catalog.Catalog;
import com.catalog.web.product.Product;

import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CatalogController {

    private CatalogServiceV1 catalogService;

    @Autowired
    public CatalogController(CatalogServiceV1 catalogService) {
        this.catalogService = catalogService;
    }

    @RequestMapping(path = "/catalog", method = RequestMethod.GET, name = "getCatalog")
    public ResponseEntity<Catalog> getCatalog() {
        return Optional.ofNullable(catalogService.getCatalog())
                .map(result -> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET, name = "getProduct")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") String productId) {
        return Optional.ofNullable(catalogService.getProduct(productId))
                .map(result -> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
