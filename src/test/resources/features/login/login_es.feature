#language: es
@login
Característica: Iniciar sesion

  @happy
  Esquema del escenario: Iniciar sesion con credenciales validas
    Dado "Arlet" desea crear una nueva publicacion
    Cuando ella ingresa sus credenciales "<userName>" y "<password>"
    Entonces ella deberia ver el dashboard con el siguiente mensaje "<mensaje>"

    Ejemplos:
      | userName | password   | mensaje                    |
      | alice    | mypassword | You are logged in as alice |


  @unhappy
  Esquema del escenario: Iniciar sesion con credenciales no validas
    Dado "Arlet" desea crear una nueva publicacion
    Cuando ella ingresa sus credenciales "<userName>" y "<password>"
    Entonces ella deberia ver el dashboard con el siguiente mensaje de error "<mensaje>"

    Ejemplos:
      | userName | password | mensaje                                     |
      | alice    | 123      | Invalid login credentials, please try again |