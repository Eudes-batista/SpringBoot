package br.com.aprendendo.demo.controller;

import br.com.aprendendo.demo.model.TipoFrete;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "tipoFrete")
public class TipoFreteControle extends DefaultController<TipoFrete, Integer> {
}
