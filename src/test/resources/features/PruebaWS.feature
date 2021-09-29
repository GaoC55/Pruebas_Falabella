Feature: Crear y obtener informacion del los empleados

  Scenario Outline: Obtener informacion del empleado
    Given El empleado existe
    When Consumir WS <id>
    Then Obtener Infomacion

    Examples: 
      | id |
      |  1 |

      Scenario Outline: Crear empleado
    Given Obtener datos empleado
    When Consumir Creacion WS <name> <salary> <age> <id>
    Then Confirmar Creacion

    Examples: 
      | name      | salary | age | id |
      |  German   | 12313  | 37  | 26 |