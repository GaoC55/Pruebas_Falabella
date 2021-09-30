Feature: Crear y obtener informacion del los empleados

  Scenario Outline: Obtener informacion del empleado
    Given El empleado existe
    When Consumir WS <id>
    Then Obtener Infomacion

    Examples: 
      | id |
      |  1 |

      Scenario Outline: Crear empleado
    Given Obtener datos empleado <name>,<salary>,<age>
    When Consumir Creacion WS
    Then Confirmar Creacion

    Examples: 
      | name      | salary | age |
      |  'Diana'   | 1231  | 36  |