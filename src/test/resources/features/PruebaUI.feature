Feature: Generar orden de compra en Falabella 

  Scenario Outline: Seleccionar Categoria
    Given Estemos en la pagina de inicio de falabella
    When Click el boton de categorias
    Then Click en la categoria <Categoria>

    Examples: 
      | Categoria   |
      |  Celulares  |
