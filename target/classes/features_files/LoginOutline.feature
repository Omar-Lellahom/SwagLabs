@loginOutline
Feature: Je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: Je souhaite me connecter a l application avec plusieurs comptes
    Given Je me connect a l application Swag Labs
    When Je saisie le user name "<username>"
    And Je saisie le password "<password>"
    And Je clique sur le boutton login
    Then "<Products>"

    Examples: 
      | username        | password     | Products                                  |
      | standard_user   | secret_sauce | Je me redirige vers la page home Products |
      | locked_out_user | secret_sauce | Echec de la chargement a la page prodcuts |
      | problem_user    | secret_sauce | Je me redirige vers la page home Products |
