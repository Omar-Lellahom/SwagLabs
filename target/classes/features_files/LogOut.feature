@testcase
Feature: Je souhaite tester la deconnexion Swag Labs

  Background: 
    Given Je me connect a l application Swag Labs
    When Je saisie le user name "standard_user"
    And Je saisie le password "secret_sauce"
    And Je clique sur le boutton login
    And Je clique sur le menu burger

  @logout
  Scenario: Je souhaite tester la deconnexion Swag Labs
    And Je clique sur Logout
    Then Je me redirige vers la page authentification Swag labs "Swag Labs"

  @about
  Scenario: Je souhaite tester le boutton about
    And Je clique sur le boutton  about
    Then Je me redirige vers la page about "https://saucelabs.com/"
