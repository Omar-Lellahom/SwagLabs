
Feature: Je souhaite tester la page de connexion de l application Swag Labs

  @loginCasPasant
  Scenario: Je souhaite tester la page de connexion avec un cas passant
    Given Je me connect a l application Swag Labs
    Then Je me redirige vers la page home "Products"

  @loginCasNonPasant
  Scenario: Je souhaite tester la page de connexion avec un cas non passant
    Given Je me connect a l application Swag Labs avec  incorrect coordoner
    Then Un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
