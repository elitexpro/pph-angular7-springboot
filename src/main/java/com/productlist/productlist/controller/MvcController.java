package com.productlist.productlist.controller;

import com.productlist.productlist.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/mvc")
public class MvcController {
    @Autowired
    ProductService productService;


}
